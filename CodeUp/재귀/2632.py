n = int(input())
memo = [0] * (n+1)

def climb(n, memo):
  if(n == 0):
    memo[0] = 0
    return memo[0]
  elif(n == 1):
    memo[1] = 1
    return memo[1]
  elif(n == 2):
    memo[2] = 2
    return memo[2]

  if(memo[n]):
    return memo[n]

  memo[n] = climb(n-1,memo) + climb(n-2, memo)
  return memo[n]

print(climb(n,memo))
