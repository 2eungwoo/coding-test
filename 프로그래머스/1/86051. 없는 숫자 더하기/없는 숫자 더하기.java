// import java.util.Map;
// import java.util.HashMap;

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for(int n : numbers) {
               sum -= n;
        }
        return sum;
//         Map<Integer, Boolean> map = new HashMap<>();
        
//         for(int n : numbers) {
//             map.put(n, true);
//         }
        
//         int sum = 0;
//         for(int i=0; i<=9; i++) {
//             if(!map.containsKey(i)){
//                 sum += i;
//             }
//         }
        
//         return sum;
    }
}