from collections import deque

def solution(N,L,arr):
    answer = []
    dq = deque()
    
    for i,n in enumerate(arr):
        while(dq and dq[-1][1] > n): # 마지막 값이 들어오는애보다 크면 팝(오름차순유지가안되니까)
            dq.pop()
        
        dq.append((i,n))
        
        if(dq[0][0] < i-L+1): # 윈도우 지나갈때마다 맨 앞쪽 짤
            dq.popleft()
        
        answer.append(dq[0][1])
        
    print(*answer)

N,L = map(int,input().split())
arr = list(map(int,input().split()))
solution(N,L,arr)