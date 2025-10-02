import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>(); // <우선순위, 인덱스>
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] { priorities[i], i });
        }
        
        int order = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            boolean hasHiger = false;
            for (int[] q : queue) {
                if (cur[0] < q[0]) {
                    hasHiger = true;
                    break;
                }
            }

            if (hasHiger) {
                queue.offer(cur);
            } else {
                order++;
                if (cur[1] == location)
                    return order;
            }
        }

        return -1;
    }

}
