import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>(); // <이름, 완주횟수>

        // participant 명단을 보고 map에 이름과 완주 횟수를 넣는다.
        // 동명이인이 나오면 그냥 그 이름에 +1 시킨다.
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // completion과 map을 비교해서 completion 명단과 map 명단에 존재하면
        // 완주횟수를 -1 시킨다.
        for (String name : completion) {
            int count = map.get(name);
            map.put(name, count - 1);
        }

        // 위 작업이 모두 마무리되면 
        // 완주횟수가 1 이상인 사람을 출력한다.
        for (String name : map.keySet()) {
            if (map.get(name) >= 1) {
                return name; // 완주 못한사람은 딱 한명이므로 바로 리턴
            }
        }

        return "";
    }
}