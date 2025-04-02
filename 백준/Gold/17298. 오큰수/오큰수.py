import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int,input().split()))
answer = [-1] * len(nums)
stack = []
# [3,5,2,7]
for i,num in enumerate(nums):
    
    if(not stack):
        stack.append(i)
        
    while(stack and nums[stack[-1]] < num):
        answer[stack.pop()] = num
    stack.append(i)
    
    
print(*answer)