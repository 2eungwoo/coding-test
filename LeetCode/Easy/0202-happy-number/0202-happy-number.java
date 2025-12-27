import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> numberSet = new HashSet<>();

        while(n != 1) {
            if(numberSet.contains(n)) {
                return false;
            }

            numberSet.add(n);
            n = calcSum(n);
        }

        return true;
    
    }

    private int calcSum(int n) {
        int sum = 0;

        while(n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }

        return sum;
    }
}

// 1 <= n <= 2^31 - 1
// 각 자리수를 각각의 솔로숫자로 쪼개서
// 이거를 제곱해서 더하는 행위를 계속 반복
// 이게 최종 1이 나오면 happy number임 

// 근데 주의해야할게 있음 
// n=4인 경우 
// 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4 -> ... 
// 이런식으로 무한루프가 가능하다 

// 따라서 n을 set에 넣어서 중복제거시키는데 
// 해피넘버 구하는 알고리즘의 루프에서 set에 없는 숫자들에 대해서만
// 루프를 진행함 
// 이경우는 해피넘버가 안되니까 false로 리턴 