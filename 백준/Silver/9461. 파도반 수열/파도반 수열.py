n = int(input())
dp = [0] * 101
#  P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
# 6부터 직전 + 5개전꺼
dp[1] = 1
dp[2] = 1
dp[3] = 1
dp[4] = 2
dp[5] = 2

def sol(k):
    for i in range(6,k+1):
        dp[i] = dp[i-1] + dp[i-5]
        
    return dp[k]

for _ in range(n):
    k = int(input())
    print(sol(k))
