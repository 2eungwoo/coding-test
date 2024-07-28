n = int(input())
memo = [0] * (n+1)

def climb(n, memo):
  if(n == 1):
    memo[1] = 1
  elif(n == 2):
    memo[2] = 2

  if(memo[n]):
    return memo[n]

  memo[n] = climb(n-1,memo) + climb(n-2, memo)
  return memo[n]

print(climb(n,memo))
