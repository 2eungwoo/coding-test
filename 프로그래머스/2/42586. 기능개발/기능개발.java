import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;

        // 1. 배포까지 걸리는 시간을 각각 구한다.
        int[] requireDate = new int[len];
        for (int i = 0; i < len; i++) {
            requireDate[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // 2. 비교한다.
        int cnt = 1;
        Stack<Integer> stack = new Stack<>();
        List<Integer> deploy = new ArrayList<>();
        for (int i = 0; i < requireDate.length; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() < requireDate[i]) {
                    deploy.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                    continue;
                }
            }
            stack.push(requireDate[i]);

        }
        deploy.add(cnt);

        return deploy.stream().mapToInt(i -> i).toArray();
        
    }
}

// 각 진도와 속도에 맞춰서 배포가 가능한 날짜를 계산함
// requireDate = ((100 - prog[i]) / speed[i]).ceil()

// requiredDate[i] 랑 requiredDate[i+n] 이랑 비교한다?
// r[i] < r[i+n] 이면 i~n-1개 배포 이걸 progresses.length까지?
// r[i]돌다가.. r[i] < r[n]인게 나오면 r[i~n-1]을 push? O(n^2)

// requireDate = {5,10,1,1,20,1}
// idx1: cnt:1 => 5 vs 10 -> 5 < 10 이므로 cnt를 push, cnt=1
// idx2: cnt:1 => 10 vs 1 -> 10 > 1 이므로 skip, cnt++
// idx3: cnt:2 => 10 vs 1 -> 10 > 1 이므로 skip, cnt++
// idx4: cnt:3 => 10 vs 20 -> 10 < 20 이므로 cnt를 push, cnt=1
// idx5: cnt:1 => 20 vs 1 -> 20 > 1 이므로 skip, cnt=1

// 마지막 cnt는 push가 안됐으니 추가로 마지막 cnt를 push

// 대소 비교 과정에서 조건에 따라 계속 들고다니는 숫자를 컨트롤해야하므로 이거를 스택을써서
// skip, push를 사용