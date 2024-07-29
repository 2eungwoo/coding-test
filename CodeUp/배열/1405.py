# codeup 1405
n = int(input())
nums = list(map(int, input().split()))

print(*nums)
for i in range(1,n):
  result = nums[i:] + nums[:i]
  print(*result)
