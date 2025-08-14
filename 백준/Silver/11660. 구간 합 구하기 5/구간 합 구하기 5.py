import sys
input = sys.stdin.readline

n,m = map(int, input().split())

nums = []
for i in range(n):
    rows = list(map(int, input().split()))
    nums.append(rows)
    
prefix_sum_arr = [[0]*(n+1) for _ in range(n+1)]
for i in range(1, n + 1):
    for j in range(1, n + 1):
        prefix_sum_arr[i][j] = nums[i - 1][j - 1] + prefix_sum_arr[i - 1][j] + prefix_sum_arr[i][j - 1] - prefix_sum_arr[i - 1][j - 1]

for i in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    result = prefix_sum_arr[x2][y2] - prefix_sum_arr[x1 - 1][y2] - prefix_sum_arr[x2][y1 - 1] + prefix_sum_arr[x1 - 1][y1 - 1]
    print(result)