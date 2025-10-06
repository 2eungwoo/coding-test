class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        int sum = 0;
        for(int i=2; i<cost.length; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
            
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}

// 계단을 오르는 경우의 수를 구하는게 아님
// 각 계단에 적혀있는 코스트의 합의 최소를 구하는거임

// 계단을 오르는 경우의 수는 dp[n]으로하면 되는데 이거랑 일대일 대응하는 누적 코스트는 어떻게?
// dp에다가 횟수가 아니라 코스트를 저장시켜서
// dp[n] 이 n까지 오르는데 누적코스트라고하면
// dp[n] = (직전까지오른 코스트의 최소) + cost[i](현재 오를 계단 코스트)

// 마지막에는 두 가지 경로로 인해 탑에 도달할 수 있는데
// 마지막 경로로 인해 또 최소값이 바뀔 수 있으니 두 경로에 대해 최소비교를 해서 리턴해줘야함