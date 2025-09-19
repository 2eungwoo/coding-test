class Solution {
    public int solution(int[][] sizes) {
        
        // [max(가로,세로),min(가로,세로)] 를 구한다음 [A,B] 라고 하면,
        // 모든 사이즈의 max 중에서 최댓값을 maxSide,
        // 모든 사이즈의 min 중에서 최댓값을 minSide 로 두고,
        // return maxSide * minSide

        /*
            [60, 50]
            [30, 70]
            [60, 30]
            [80, 40]
        
            sizes[i][0] 가로
            sizes[i][1] 세로
         */

        int maxSide = Integer.MIN_VALUE;
        int minSide = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                maxSide = Math.max(maxSide, Math.max(sizes[i][0], sizes[i][1]));
                minSide = Math.max(minSide, Math.min(sizes[i][0], sizes[i][1]));
            
            }
        }
        return maxSide * minSide;
        
    }
}

// 2번 명함을 가로로 수납한다?
// 2번명함 : 가로30 세로70인데
// 가로로 놓으면 가로70 세로30이 되니까
// 80x50에 들어간다는 뜻임

// 가로 -> 가로,세로
// 세로 -> 가로,세로
// 변환한버전 모두 사이즈 범위 안에 들어가는
// 최소값을 각각 구한다음 넓이를 구하면되나?
// 다 포함할 수 있는 minimum

// O(n^2) = 1억
// 이하로 풀어야되니까... O(n^2)도 가능?

// 안들어가는거는 돌려서 집어넣으면 되니까
// 한 사이드는 최댓값, 한 사이드는 최소값으로 넣으면 됨
// 만들어두면 안들어가는거는 돌려서 어케든 넣을 수 있음
// 왜냐? 한 쪽은 max사이즈이기때문에 무조건 포함이 될 수밖에 없음