import sys
from collections import deque

def solution(N,L,arr):
    answer = []
    dq = deque()
    
    for i,n in enumerate(arr):
        while(dq and dq[-1][1] > n):
            dq.pop()
        
        dq.append((i,n))
        
        if(dq[0][0] < i-L+1): 
            dq.popleft()
        
        answer.append(dq[0][1])
        
    print(*answer)

N,L = map(int,sys.stdin.readline().split())
arr = list(map(int,sys.stdin.readline().split()))
solution(N,L,arr)