import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();

        for (String[] c : clothes) {
            String clothesType = c[1];
            map.put(clothesType, map.getOrDefault(clothesType, 0) + 1);
        }
        
        int sum = 1;
        for (int v : map.values()) {
            sum *= (v + 1);
        }

        return sum - 1; // 안입음으로만 조합된 경우도 포함됐으므로 빼야함
    }
}

// 단독착용, 조합착용

// key에 매핑된 value는 옷 타입의 개수니까 
// 단독 착용을 고려하면 독립적으로 다 더해야됨
// 조합 착용의 경우
// value간의 곱이 됨

/*
얼굴	동그란 안경, 검정 선글라스, 안입음
상의	파란색 티셔츠, 안입음
하의	청바지, 안입음
겉옷	긴 코트, 안입읍

이렇게 전체를 고쳐놓고 조합을 세면 쉽고 정확하다.
 */