from collections import deque

n = int(input())
x, y = map(int, input().split())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
dist = [[-1] * (n+1) for _ in range(n+1)]

def bfs(i,j):
    q = deque([(i,j)])
    dist[i][j] = 0
    
    while(q):
        cur_x, cur_y = q.popleft()
        cur_dist = dist[cur_x][cur_y]
        
        for i in range(4):
            nx, ny = cur_x + dx[i], cur_y + dy[i]

            if(0 <= nx <= n and 0 <= ny <= n and dist[nx][ny] == -1):
                dist[nx][ny] = cur_dist + 1
                q.append((nx,ny))
            
bfs(x, y)


for i in range(1,n+1):
    for j in range(1,n+1):
        print(dist[i][j]+1,end=" ")
    print()
