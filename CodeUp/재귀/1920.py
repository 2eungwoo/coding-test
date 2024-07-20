import sys
sys.setrecursionlimit(10**7)

n = int(input())

def binary(n):
    
    if(n == 0):
        print(0,end="")
        return 
    
    if(n == 1):
        print(1,end="")
        return 
    
    binary(n//2)
    print(n%2,end="")
    
binary(n)
