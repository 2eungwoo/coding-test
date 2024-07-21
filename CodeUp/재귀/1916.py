import collections
import sys
sys.setrecursionlimit(10**7)

n = int(input())

memo = collections.defaultdict(int)

def fibo(n):
    if(n == 1 or n == 2):
        return 1
    
    if(n in memo):
        return memo[n]

    memo[n] = fibo(n-1) + fibo(n-2)
    return memo[n]

print(fibo(n)%10009)
