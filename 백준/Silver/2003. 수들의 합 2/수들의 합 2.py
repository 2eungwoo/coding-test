n, target = map(int,input().split())
nums = list(map(int, input().split()))

left, right = 0, 1
cnt = 0

while(right <= n and left <= right):
    sum_nums  = nums[left:right]
    total = sum(sum_nums)
    
    if(total == target):
        cnt += 1
        right +=1
    elif(total < target):
        right += 1
    else: # total > target
        left += 1

print(cnt)