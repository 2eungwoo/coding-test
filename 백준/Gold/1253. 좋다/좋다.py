n = int(input())
nums = list(map(int, input().split()))
nums.sort()

cnt = 0
for i in range(n):
  target = nums[i]
  left, right = 0, len(nums)-1

  while(left < right):
    if(nums[left] + nums[right] < target):
      left += 1
    elif(nums[left] + nums[right] > target):
      right -= 1
    else: # nums[left] + nums[right] == target
      if(i == left):
        left += 1
      elif(i == right):
        right -= 1
      else:
        cnt += 1
        break

print(cnt)
