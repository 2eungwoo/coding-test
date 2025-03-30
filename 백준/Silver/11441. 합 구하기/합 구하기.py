import sys

n = int(sys.stdin.readline().strip())
nums = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline().strip())

prefix_sum = [0] * n
prefix_sum[0] = nums[0]
for i in range(1, n):
    prefix_sum[i] = prefix_sum[i - 1] + nums[i]

for k in range(m):
    x, y = map(int, sys.stdin.readline().split())
    i, j = x-1, y-1  
    
    if i == 0:
        print(prefix_sum[j])
    else:
        print(prefix_sum[j] - prefix_sum[i-1])