
import sys
from collections import deque

input = sys.stdin.readline

F, S, G, U, D = map(int, input().split())

def bfs(S):
    queue = deque([S])
    dist = [-1] * (F + 1)
    dist[S] = 0
    
    while(queue):
        # 빼고 방문하고 넣고
        cur = queue.popleft()
        
        if(cur == G):
            return dist[cur]
        
        dir = [U,-D]
        for i in range(2):
            next_floor = cur + dir[i]
            if(1 <= next_floor <= F and dist[next_floor] == -1):
                dist[next_floor] = dist[cur] + 1
                queue.append(next_floor)
                
    return -1

result = bfs(S)
if(result == -1):
    print("use the stairs")
else:
    print(result)