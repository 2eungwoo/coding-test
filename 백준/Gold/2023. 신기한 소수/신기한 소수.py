import sys
input = sys.stdin.readline

n = int(input())
answer = []

def isPrime(num):
    for i in range(2,(num//2)+1):
        if(num % i == 0):
            return False
    return True

# idx => 자릿수. 편의상 idx라고함
def dfs(idx, path):
    if(len(str(path)) == n):
        answer.append(path)
        return
        
    for i in range(1,10,2):
        next = path * 10 + i
        if(isPrime(next)):
            dfs(idx+1, next)
            
    
dfs(1,2)
dfs(1,3)
dfs(1,5)
dfs(1,7)
for n in answer:
    print(n)