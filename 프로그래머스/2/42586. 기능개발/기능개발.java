import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 일단 각 기능이 배포되는데까지 걸리는 시간을 구함
        // 100을 넘어야되니까 (100 - p[i]) / s[i] 에다가 반올림해야됨
        int[] require = new int[progresses.length];
        for (int i = 0; i < require.length; i++) {
            require[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // 소요 시간을 밀어넣으면서 비교함
        int cnt = 1;
        Stack<Integer> stack = new Stack<>();
        List<Integer> deploy = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() < require[i]) {
                    deploy.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                    continue;
                }
            }
            stack.push(require[i]);
        }
        deploy.add(cnt);

        return deploy.stream().mapToInt(i -> i).toArray();
    }
}

// 일단 각 기능이 배포되는데까지 걸리는 시간을 구함
// 작업이 배포까지 걸리는 시간을 require[] 라고 하겠음
// [95,90,99,99,80,99] 에서 [1,1,1,1,1] 일 때
// requred = [5,10,1,1,20,1] 임
// 앞에꺼가 배포되어야 뒤에꺼가 배포됨
// 워터폴임
// 몇 개의 기능이 배포되는지 담는걸 deploy[] 라고 하겠음
// 배포될 때 누적해서 cnt에 담아서 deploy 넣겠음(각 i에는 한방에 배포된 개수를 담음)

// stack을 사용해서 프로세스를 넣고
// 다음 프로세스랑 비교를 해서 만약 다음거가 더 크면 배포 바로 가능하니 cnt++, 스택에서 작업을 뺌
// 만약 다음거가 더 작으면 기다려야하므로 cnt는 냅두고 push도 안함

// 배포를 할 수 있으면 누적카운트를 deploy에 넣고, 다시 누적카운트를 1로 초기화

/*
    idx=0, 첫작업은 배포가능, 뒤에꺼랑 비교를 아직 안했으므로 작업시간만 stack에 밀어넣음 idx=1부터 비교 시작
    idx=1, cnt=1, peek:5 < r[i]:10 이므로 배포 가능함, 배포했으니 누적 초기화, stack은 새로 기준 갱신, deploy:[1]
    idx=2, cnt=1, peek:10 > r[i]:1 이므로 기다려야됨, 누적++만 하고 skip
    idx=3, cnt=2, peek:10 > r[i]:1 이므로 기다려야됨, 누적++만 하고 skip
    idx=4, cnt=3, peek:10 < r[i]:20 이므로 배포가 됨, 누적초기화, stack기준갱신, deploy[1,3]
    idx=5, cnt=1, peek:20 > r[i]:1 이므로 기다려야됨, 누적++만 하고 skip

    cnt=2
    마지막인 idx=5는 인덱스 끝나서 비교가안됨 따라서 무조건 배포 가능 deploy[1,3,2]
*/

