import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>(); // 이름,완주횟수
        
        for(String name : participant) {
            map.put(name, map.getOrDefault(name,0) + 1);
        }
        
        for(String name : completion) {
            int count = map.get(name);
            map.put(name, count-1);
        }
        
        for(String name : map.keySet()) {
            if(map.get(name) > 0) {
                return name;
            }
        }
        
        return "";
    }
}