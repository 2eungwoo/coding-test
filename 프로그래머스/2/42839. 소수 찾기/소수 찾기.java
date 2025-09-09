import java.util.HashSet;
import java.util.Iterator;

class Solution {
    private static HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {        
        int count = 0;

        // 1. 완전 탐색으로 숫자를 조합한다.
        generate("", numbers);

        // 2. 소수인지 판별한다.
        Iterator<Integer> it = numberSet.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }    
    
    // 숫자 조합 동작
    private static void generate(String cur, String others) {
        // 1. 현재값 == 조합된 숫자 ==> set에 넣기
        if (!cur.equals("")) {
            numberSet.add(Integer.valueOf(cur));    
        }

        // 2. 상태전이 ==> 다음값으로 조합
        // 조합 ==> 현재값 + 다음숫자, others => 그 숫자제외한 나머지 숫자들 ==> i번째요소를 제외한 나머지들
        for (int i = 0; i < others.length(); i++) {
            String comb = cur + others.charAt(i);
            String nextComb = others.substring(0, i) + others.substring(i + 1);
            generate(comb, nextComb);
        }
        

    }

    private static boolean isPrime(int num) {
        // 1. 0,1은 소수 아님
        if (num == 0 || num == 1) {
            return false;
        }

        // sqrt(limit) 까지만 보고 나눠지는 수 있는지 보면 됨
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}

// 완전 탐색으로 숫자를 조합해서 그게 소수인지 판별해서 count
// 그러면 같은 숫자가 들어오면 중복해서 카운트 할 수 있음
// set에 조합된 숫자를 넣어서 판별하는 방식으로 중복를 제거함 -> 판별할 루프 자료구조가 set