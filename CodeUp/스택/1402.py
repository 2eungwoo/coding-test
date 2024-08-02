# 5
# 1 3 5 6 8
n = int(input())
nums = list(map(int, input().split()))
stack = []

for i in range(n):
    stack.append(nums[i])
    
for _ in range(n):
    print(stack.pop(),end=" ")
