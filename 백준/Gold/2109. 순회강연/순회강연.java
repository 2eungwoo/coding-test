import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lecture = new int[n][2]; // <pay, day>
        
        int maxDay = 0;
        // 오늘까지 돌수있는 강연의 수입을 구하는거니까
        // '오늘'에 가장 가까운 최대 날짜를 구해서 이걸 기준으로 반복문을 돌기 위한 max값 산출
        // 마지막날짜(maxDay) 를 구해야된다
        for (int i = 0; i < n; i++) {
            lecture[i][0] = sc.nextInt();
            lecture[i][1] = sc.nextInt();
            maxDay = Math.max(maxDay, lecture[i][1]);
        }

        // 마감일 기준 내림차순 정렬
        Arrays.sort(lecture, (a, b) -> b[1] - a[1]);
        // 마감일이 같을 때의 경우 정렬 조건을 커스텀해줄 필요가 없다.
        // 이 문제에서 마감일이 같은 강연들을 PQ에 떄려넣고 그 안에서 pay를 기준으로 pq에의해 자동 선택할거기때문에
        // PQ에 넣을것이므로 마감일이 같을때 pay가 큰거를 기준으로 또 조건을 건다거나 할 필요가 없다는 뜻임
        
        // max힙 선언 방법 ( Collections.reverseOrder() 추가 )
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
        int idx = 0;
        int count = 0;
        // 오늘까지의 강연계획 중에서 고르는거니까
        // 마감일에 최대한 가까운 날짜부터 거꾸로 반복함
        // 만약 day=0 -> maxDay 이렇게 가면 미래의 후보에 대해서 미리 알아야되므로 탐색을 n회 더해야함 
        // 이걸 안하려고 PQ를 쓰는거다
        for (int day = maxDay; day > 0; day--) {
            while (idx < n && lecture[idx][1] >= day) { // 날짜 내림차순이 돼있는 lecture보다 day가 큰 경우는 루프를 탈출해야함 (못뛰니까)
                // lecture 안에서 순회하는데, 해당날짜(day) 기준 뛸수있는 강연을 찾아서
                // 그 날의 pay를 pq에 넣어준다. 이걸로 비교를 할거임
                pq.offer(lecture[idx][0]);
                idx++;
                
            }

            // 하루에 하나밖에 못도니까 반복 범위를 day 생명주기랑 맞춤
            if (!pq.isEmpty()) {
                count += pq.poll(); // maxHeap의 top -> 가장 높은 pay 누적
            }
        }

        System.out.println(count);
    }
}

// 정렬 O(nlogn) + pq삽입/삭제 O(long)