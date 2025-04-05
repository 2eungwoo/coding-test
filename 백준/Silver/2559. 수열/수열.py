import sys
input = sys.stdin.readline

n, m = map(int, input().split())
nums = list(map(int, input().split()))

prefix_sum = [0] * n
prefix_sum[0] = nums[0]
for i in range(1,n):
    prefix_sum[i] = prefix_sum[i - 1] + nums[i]

max_sum = prefix_sum[m - 1]
for i in range(m, n):
    cur_sum = prefix_sum[i] - prefix_sum[i-m] 
    max_sum = max(max_sum, cur_sum)
    
print(max_sum)