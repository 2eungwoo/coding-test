import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(String numbers) {
        // 1. 숫자 조합 + set에 저장
        Set<Integer> numberSet = new HashSet<>();
        
        String init = "";
        boolean[] used = new boolean[numbers.length()];
        generateCombination(init, numbers.toCharArray(), used, numberSet);
        
        // 2. 소수 판별 + 맞으면 cnt++
        int cnt = 0;
        Iterator<Integer> it = numberSet.iterator();
        
        while(it.hasNext()) {
            int num = it.next();
            if(isPrime(num)) {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private void generateCombination(
        String cur, 
        char[] others, 
        boolean[] used,
        Set<Integer> numberSet){
        
        // 현재 값 처리 -> 조합된 cur를 set에 넣음
        if(!cur.equals("")) {
              numberSet.add(Integer.valueOf(cur));
        }
        
        // 다음 값 처리 -> 현재에다가 아직 안쓴거를 조합함
        // 아직 안쓴거는 others의 index와 used의 index로 조절
        for(int i=0; i<others.length; i++) {
            if(!used[i]) {
                used[i] = true;
                generateCombination(cur + others[i], others, used, numberSet);
                used[i] = false;
            }
        }
        
    }
    
    private boolean isPrime(int num) {
        if(num == 0 || num == 1) {
            return false;
        }
        
        int sqrtNum = (int) Math.sqrt(num);
        for(int i=2; i<=sqrtNum; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 주어진 문자열로 조합 가능한 숫자를 다 만들어본 다음 소수인지 하나하나 판별해야한다.
// 011의 경우, 1,1이 다른 인덱스에 위치하지만 같은 숫자값이기 때문에 중복 판별의 여지가 있으므로 set에 담아서 중복된 값은 배제하도록 한다.
// 1.숫자 다 조합하기 -> 2. 소수판별하기 -> 3. 맞으면 cnt++하기