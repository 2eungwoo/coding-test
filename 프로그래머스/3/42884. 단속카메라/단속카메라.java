import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 진출 시점 기준 오름차순 정렬
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1],b[1]));
        
        int count = 0;
        int lastCamera = Integer.MIN_VALUE;
        
        for(int[] r : routes) {
            if(lastCamera < r[0]) {
                lastCamera = r[1];
                count++;
            }
        }
    
        return count;
    }
}

// 모든 차량을 카메라가 찍으려면
// 카메라 설치 범위 내에 차량이 많이 있게 하면 된다.
// 회의실 배정 문제랑 비슷한 그리디 풀이로 접근

// 진출 시점 기준으로 오름차순 정렬 -> 가장 빨리 나가는 차량 기준으로 설치해야 최소 이상 설치 가능
// 정렬된 애로 이제 각 차량의 진입 시점을 비교한다.
// 현재 카메라로 어떤 차량의 진입 시점을 봤을때, 이전의 차량 진입 시점보다 늦으면
// 이 카메라는 위치를 바꿔야함 -> 이전 차량의 진출 시점
// 그래야 둘 다 찍을 수 있다. 여기는 카메라를 설치해야하는 지점이다.
