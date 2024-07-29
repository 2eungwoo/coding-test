n = int(input())
m = int(input())
nums = list(map(int,input().split()))

nums.sort()

left, right = 0, len(nums)-1
cnt = 0

while(left < right):
    sum = nums[left] + nums[right]    
    if(sum < m):
        left += 1
    elif(sum > m):
        right -= 1
    else: # sum == m
        cnt += 1
        left += 1
        right -= 1
        
print(cnt)