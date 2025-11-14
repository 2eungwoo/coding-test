import java.util.Set;
import java.util.HashSet;

class Solution {
    private static Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {

        String init = "";
        boolean[] used = new boolean[numbers.length()];

        // 가능한 모든 숫자 조합
        combinate(init, numbers, used);

        // 조합된 리스트를 돌면서 isPrime() --> cnt++;
        int cnt = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                cnt++;
            }
        }

        return cnt;
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
    
    private void combinate(String curComb, String candidates, boolean[] used) {
        // 현재 값
        // 셋에 넣음
        if(!curComb.equals("")) {
            numberSet.add(Integer.valueOf(curComb));
        }

        // 다음 값
        // 조합함
        for (int i = 0; i < candidates.length(); i++) {
            if (!used[i]) {
                // 다음 상태로 넘길 때 후보를 줄여줘야함
                // 현재 조합에서 쓴 애 말고 나머지 애를 후보로 넣어야함
                // 현재 쓴거는 체크해놓고, 다음에 또 쓸 수 있게 해야됨
                used[i] = true;
                combinate(curComb + candidates.charAt(i), candidates, used);
                used[i] = false;
            }
        }
    }

    
}

/*
    주어진 숫자로 모든 조합을 만들어봄
    그러면서 소수가 있으면 cnt++
    17 -> 1, 7, 17, 71
    경우의 수 : n! 

    반복마다 조합한 숫자를 list에 담은 다음
    list를 돌면서 isPrime()? --> cnt++

    근데 011의 경우 011이랑 11이랑 같이 해야되니까
    list에 넣을 때 Integer.valueOf()로 넣으면 걍 0맨앞 해결
    11의 경우 1,1이 각각 다른 idx라서 중복되므로
    list에 넣을 때 중복 고려 -> set으로


    추적해야되는 값 :
        numbers조합을 할거니까 어디에 해당되는 요소를 뽑을건지에 대한 idx
        현재까지의 조합된 숫자
*/