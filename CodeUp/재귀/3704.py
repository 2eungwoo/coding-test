import sys

sys.setrecursionlimit(10**6)

n = int(input())
memo = [0] * (n+1)

def climb(n, memo):
  if(n == 0):
    memo[0] = 0
    return memo[0] % 1000
  elif(n == 1):
    memo[1] = 1
    return memo[1] % 1000
  elif(n == 2):
    memo[2] = 2
    return memo[2] % 1000
  elif(n == 3):
    memo[3] = 4
    return memo[3] % 1000

  if(memo[n]):
    return memo[n] % 1000
  
  memo[n] = (climb(n-1, memo) + climb(n-2, memo) + climb(n-3, memo)) % 1000
  return memo[n]

print(climb(n, memo))

