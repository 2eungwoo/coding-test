from collections import deque

N,L = map(int,input().split())
arr = list(map(int,input().split()))

answer = []
window = deque()

for i in range(N):
    while(window and window[-1][1] > arr[i]):
            window.pop()
            
    window.append((i, arr[i]))
    
    if(window[0][0] < i-L+1):
        window.popleft()
        
    answer.append(window[0][1])

print(*answer)
    
