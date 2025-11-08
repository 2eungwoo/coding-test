import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String numbers) {

        Set<Integer> numberSet = new HashSet<>();
        String init = "";
        boolean[] used = new boolean[numbers.length()];
        generate(init, numbers, used, numberSet);

        int cnt = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                cnt++;
            }
        }

        return cnt;

    }
    
    private void generate(String curComb, String candidates, boolean[] used, Set<Integer> numberSet) {

        // 현재 값
        if (!curComb.equals("")) {
            numberSet.add(Integer.valueOf(curComb));    
        }
        
        // 상태 전이
        for (int i = 0; i < candidates.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                generate(curComb + candidates.charAt(i), candidates, used, numberSet);
                used[i] = false;
            }
            
        }
    }

    private boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        int middle = (int) Math.sqrt(num);
        for (int i = 2; i <= middle; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
    


     


/*
    주어진 입력으로 숫자를 모두 조합해본 다음에
    소수인지 판별해서 count해야함

    근데 011 입력의 경우 인덱스가 달라도 값이 같음
    -> 중복 판단으로 count에 오답 영향을 끼칠 수 있으므로 고려해야함

    주어진 입력으로 만들 수 있는 숫자를 각각 담은 다음 
    반복 돌면서 이게 isPrime()? 
    근데 이 저장을 set으로 함
*/

/*
    근데 011 같은 경우 또 11이랑 같은 경우로 본다고 했음
    조합을 담는 set에 애초에 숫자 타입으로 넣으면 됨 -> Set<Integer> set
*/