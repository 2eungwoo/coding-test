import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(String numbers) {
        // 1. 숫자 조합을 만든다. 
        // - 조합된 숫자를 담을 때 set 사용 -> 그래야 조합 후 중복된거 뺴고 넣음
        HashSet<Integer> numberSet = new HashSet<>();

        // - 각 숫자가 조합에 쓰였는지 추적
        boolean[] used = new boolean[numbers.length()];

        // 1. 숫자 조합을 만든다.
        generate("", numbers.toCharArray(), used, numberSet);

        // 2. set 안의 숫자들이 소수인지 판별한다. 
        // - 소수면 count++
        int count = 0;
        Iterator<Integer> it = numberSet.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }
    
    private void generate(String cur, char[] others, boolean[] used, HashSet<Integer> numberSet) {
        // 1. 현재 상태 처리
        // - 첫 수행 상태 : "" -> 조합에 넣어야됨 skip해야됨
        // - n+1 수행 상태 : "n" -> set에 넣음
        if (!cur.equals("")) {
            numberSet.add(Integer.valueOf(cur));
        }
 
        // 2. 다음 상태 처리 ( 조합 진행 )
        // - 현재꺼에 조합 : cur + others[i]
        // - 그러고나면 이제 남은 숫자들(others)는 ? 
        // - others 다 돌때까지만 재귀호출하므로 종료조건 필요 없음
        for (int i = 0; i < others.length; i++) {
            if (!used[i]) {
                used[i] = true;
                generate(cur + others[i], others, used, numberSet);
                used[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num) {
        // 0,1은 소수 아님
        if (num == 0 || num == 1) {
            return false;
        }

        // 제곱근 까지만 돌렸을 때 나눠떨어지면 소수 아님
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}

// 17이 주어지면 1, 7, 17, 71 이렇게 다 만들어보고 소수인지 판별해야됨
// 주어진 입력으로 만들 수 있는 모든 조합을 생각해봐야되니까 완전탐색
// 이 떄 중복 숫자는 두 번 탐색하는 문제가 있으므로 
// 판별할 대상을 set에 넣어서 중복 제거하고 완전탐색 진행

// 완전 탐색으로 숫자를 조합해서 그게 소수인지 판별해서 count
// 그러면 같은 숫자가 들어오면 중복해서 카운트 할 수 있음
// set에 조합된 숫자를 넣어서 판별하는 방식으로 중복를 제거함 -> 판별할 루프 자료구조가 set

// 011이랑 11이랑 같은 숫자로 판단해야되므로 String으로 받은 다음 number로 형변환해주기

// 완전 탐색 방법:
// 조합 : 현재 숫자 + 다음 숫자
/*
    for(int i=0~n) { // n: 조합 아직 안한 나머지(others) 숫자 길이
        generate(cur + nums[i], others);
    }
 */