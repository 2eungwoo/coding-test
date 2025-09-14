import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>(); // cloth, count

        for (String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }

        int sum = 1;
        for (int c : map.values()) {
            sum *= (c + 1);
        }

        return sum - 1;
    }
}

// 중복해서 못 입는다고 set을 쓰면
// 하나의 종류에 대해 다른 의상은 아예 배제되어버림
// 의상 종류에 따라 의상 이름이 달라지고 세어야 하는 것은 의상 이름이므로
// 의상 종류를 key로 두고 그 종류에 맞는 의상 이름이 몇개냐를 활용하는 자료구조를 쓴다
// ==> HashMap<종류,개수>


// 그럼 조합 가능한 총 개수는 어케 세느냐?
// 1. (단독착용) key에 해당하는 value 몇개인지
// 2. (조합착용) 각 종류의 개수 끼리의 곱  
/*
얼굴	동그란 안경, 검정 선글라스
상의	파란색 티셔츠
하의	청바지
겉옷	긴 코트

에서, 2개 x 1개 x 1개 x 1개 

까지만하면 무조건 모두 입는 경우니까
안입는 경우도 포함해서 세면 단독착용까지 한꺼번에 세어지므로

얼굴	동그란 안경, 검정 선글라스, 안입음
상의	파란색 티셔츠, 안입음
하의	청바지, 안입음
겉옷	긴 코트, 안입음

이렇게 해서
3개 x 2개 x 2개 x 2개 
에서 모두 안입는 경우 -1 개
 */