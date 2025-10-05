import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, int[]> pos = new HashMap<>(); // 번호, 위치인덱스[i][j]
    private int[] leftHandPos;
    private int[] rightHandPos;

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        initKeypad();
        initHandPosition();

        for (int target : numbers) {
            if (target == 1 || target == 4 || target == 7) {
                pressWithLeft(sb, target);
            } else if (target == 3 || target == 6 || target == 9) {
                pressWithRight(sb, target);
            } else {
                int leftDist = calcDistance(leftHandPos, pos.get(target));
                int rightDist = calcDistance(rightHandPos, pos.get(target));

                if (leftDist < rightDist) {
                    pressWithLeft(sb, target);
                }
                else if (leftDist > rightDist) {
                    pressWithRight(sb, target);
                } 
                else {
                    if (hand.equals("left")) {
                        pressWithLeft(sb, target);
                    }
                    else {
                       pressWithRight(sb, target); 
                    }
                }
            }
        }

        return sb.toString();
    }
    
    private void initHandPosition() {
        leftHandPos = pos.get(-1);
        rightHandPos = pos.get(-2);
    }
    

    private void initKeypad() {
        int[][] keypad = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { -1, 0, -2 } // *:-1 ,#:-2
        };

        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < 3; j++) {
                pos.put(keypad[i][j], new int[] { i, j });
            }
        }
    }
    
    private void pressWithLeft(StringBuilder sb, int target) {
        sb.append("L");
        leftHandPos = pos.get(target);
    }

    private void pressWithRight(StringBuilder sb, int target) {
        sb.append("R");
        rightHandPos = pos.get(target);
    }

    private int calcDistance(int[] from, int[] to) {
        return Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
    }
}

// 키패드 누르기
//    1. 왼손으로 누르기
//    2. 오른손으로 누르기
// 누르기 규칙 판단
// 1. 왼손거리, 오른손거리 따진다.
// 2. 두 거리가 같다면 어느쪽손잡이인지를 따져서 그쪽손으로 누른다.

// 누르고 나면, 그 위치에서 손이 멈춰있어야함. 
// 다음 버튼으로의 거리를 또 구해야됨

// 거리는 어케 구하느냐?
// 직선거리만 유효하다 -> 맨해튼거리
// - 키패드를 2차원배열로 쓰거나 맵으로 <번호,위치[i][j]> 이렇게 쓰거나
// 그래서 |x0 - x1| + |y0 - y1|

// 누른다 라는 행동의 정의
// 지금 답 형식을 보면 누른 손의 문자를 추가하는 형식임
// stringbuilder에다가 append(왼손 or 오른손) 계속 추가해주면 될듯
// 누르고나서 위치에 손이 멈춰있어야됨