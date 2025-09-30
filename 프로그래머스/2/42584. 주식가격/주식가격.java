import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] prices) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            queue.add(new int[]{i, prices[i]}); // <인덱스,가격>
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int interval = 0;
            for(int i=cur[0]; i<prices.length; i++) {
                interval++;
                if(prices[i] < cur[1]){
                    break;
                }
            }
            result.add(interval-1);
        }
        
        return result.stream().mapToInt(i -> i).toArray();

        
    }
}

// 현재 들어온 prices 값에서 다음 값에 대한 비교를 해야함

// [1,2,3,2,3] 일 때, p[i] vs p[i+n] 

// 만약 [2,2,2,3,1] 이면?
// p[0]은 p[4]때 떨어짐 -> 4초
// p[1]은 p[4]때 떨어짐 -> 3초
// p[2]은 p[4]때 떨어짐 -> 2초
// p[3]은 p[4]때 떨어짐 -> 1초
// p[4]는 무조건 0초?

// 떨어지는 곳의 idx - p[i] ?
// 떨어지는곳은 어케구하나? 지금 보고있는 가격(p[i]) 이후 요소만 비교
// 우측 방향으로만 비교를 진행함

// [2,1,1,3,2] 면?
// p0은 p1때 떨어짐 -> 1초
// p1은 끝까지 안떨어짐 -> 3초 -> p.length - p.idx
// p2는 끝까지 안떨어짐 -> 2초 -> p.length - p.idx
// p3은 p4때 떨어짐 -> 1초