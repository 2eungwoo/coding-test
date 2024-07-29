# codeup 1402
n = int(input())
nums = list(map(int, input().split()))

for i in range(n):
  print(nums[-i-1], end=" ")
