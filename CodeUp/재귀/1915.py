import sys
sys.setrecursionlimit(10**7)

n = int(input())

def fibo(n):
    if(n == 1 or n == 2):
        return 1
    
    return fibo(n-1) + fibo(n-2)
    
    
print(fibo(n))
    
# n = 1, fibo = 1
# n = 2, fibo = 1
# n = 3, fibo = 2
# n = 4, fibo = 3 ... 

# fibo(n) = fibo(n-1) + fibo(n-2)

    
