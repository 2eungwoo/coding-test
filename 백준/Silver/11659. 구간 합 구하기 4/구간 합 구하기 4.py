import sys

input = sys.stdin.readline
n, m = map(int, input().split())
nums = list(map(int, input().split()))

sum_list = [0]  # idx 접근 문제 때문에 배열전체길이 +1하려고 맨앞에 0 둠
cur_sum = 0

for i in range(n):
    cur_sum += nums[i]
    sum_list.append(cur_sum)

    
for _ in range(m):
    i, j = map(int,input().split())
    print(sum_list[j]-sum_list[i-1])

# 누적합 : s[i] = s[i-1] + 1
# 구간합 : s(i,j) = s[j] - s[i-1]