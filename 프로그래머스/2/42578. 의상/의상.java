import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> maps = new HashMap<>(); // clothes, count
        
        for(String[] c : clothes) {
            maps.put(c[1], maps.getOrDefault(c[1], 0) + 1);
        }
        
        int answer = 1;
        for(int cnt : maps.values()) {
            answer *= (cnt + 1);
        }
        
        return answer-1;    
    }
}