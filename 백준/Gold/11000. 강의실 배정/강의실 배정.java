import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][2]; // start, end

        for (int i = 0; i < n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        // 시작시간 기준 오름차순 정렬
        Arrays.sort(time, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(time[0][1]);

        for (int i = 1; i < n; i++) {
            if (pq.peek() <= time[i][0]) {
                pq.poll();
            }
            pq.offer(time[i][1]);
        }

        System.out.println(pq.size());
    }
}
// 회의실배정 문제랑 다른점은, 겹치는 구간을 동시에 추적해야한다는 점
// 회의실배정은 하나의 타임라인에서 최대한 많은 회의실을 정해주는거고
// 강의실배정은 동시에 여러 타임라인이 존재하므로 동시간대에 가능한 최대의 강의실을 배정해주는 것
// 따라서 현재 열린 강의실의 모든 종료시간을 계속 추적해야함 -> 종료시간을 다루는 우선순위 큐를 쓴다

/*
1. 현제 열려있는 강의실 중에서 가장 빨리 끝나는 시간을 찾는다 => pq.peek()
      ㄴ 끝나자마자 바로 실행시키기 위해 시작시간이랑 비교해줌 time[i]
2. 찾았으면 바로 그 강의실을 재사용함 -> 강의실을 종료시간큐에서 제외 -> pq.poll()
3. 새로운 강의실을 쓰고있으므로 종료시간큐에 새로운 종료시간 추가
4. 최종 남은 큐에는 현재 동시에 진행중인 강의들의 종료시간이 남아있음 -> 필요한 강의실의 개수 pq.size() 
 */