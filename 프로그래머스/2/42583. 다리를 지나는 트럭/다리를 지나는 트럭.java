import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        // 대기[7,4,5,6] -> 다리(2)[][] -> 완료[]
        // 1. 7출발 -> 다리[7][] -> 완료[]
        // 2. 4출발하면 다리가 weight(10) 넘기니까 출발못함 -> 다리[][7] -> 완료[]
        // 3. 4출발 -> 다리[4][] -> 완료[7]
        // 하나만 지났는데도 3초 걸림 -> 다 건넜을 시점에 뭔가 추가 작업이 필요함 
        Queue<Integer> bridge = new LinkedList<>();

        // 다리 길이를 0으로 채워서 빈 상태를 표현
        // 다리가 시간이 지남에 따라 한칸이동한거를 poll()로 표현할 예정
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        int truck_idx = 0; // 트럭 세는데만 쓸거임
        int time = 0;
        int curWeight = 0;

        // 대기 트럭 스캔 끝나면 다 건넌거임
        while (truck_idx < truck_weights.length) {
            // 시간++ 에 따른 행동
            time++;
            curWeight -= bridge.poll(); // 1턴 당 1칸 전진

            // 1. 건넘 : 건널 수 있는 조건
            //      1. 현재+다음 올려도 다리 허용 무게 이하인가? isUnderWeight()
            //      (다리가 꽉 찼는가는 사실상 의미 없음)
            // 2. 못건넘 : 다리에 트럭대신 0올림
            if (isUnderWeight(truck_weights[truck_idx], curWeight, weight)) {
                cross(bridge, truck_weights[truck_idx]);
                curWeight += truck_weights[truck_idx++];
            } else {
                bridge.add(0);
            }
        }

        // [][][] 이라고 치면(다리길이3)
        // [1][][] -> [][1][] -> [][][1] -> [][][] 이렇게 해야 다 건넌거니까
        // 마지막 트럭이 지날때는 다리길이만큼 시간이 소요됨
        return time + bridge_length;
    }

    private boolean isUnderWeight(int nextTruckWeight, int curWeight, int maxWeight) {
        return curWeight + nextTruckWeight <= maxWeight;
    }

    private void cross(Queue<Integer> bridge, int nextTruck) {
        bridge.add(nextTruck);
   }    
}

// 경과 시간을 time++로 체크한다. while(true) {.. time++}
// while 내에서 다리를 건넌다.

// 1-time마다 [대기]top을 빼고 [다리]에 push
// 1-time마다 [다리]top을 빼고 -> [완료]에 push
// 다리에 올릴때 bridge length, weight 고려해야됨
