from collections import deque

def solution(maps):
    
    dx = [1,0,-1,0]
    dy = [0,-1,0,1]
    n,m = len(maps), len(maps[0])
    dist = [[0] * m for _ in range(n)]
    
    def bfs(x,y):
        queue = deque([(x,y)])
        dist[x][y] = 1
        
        while(queue):
            cur_x, cur_y = queue.popleft()
            
            for i in range(4):
                nx, ny = cur_x + dx[i], cur_y + dy[i]
                if(0<= nx < n and 0<= ny < m and maps[nx][ny] == 1 and dist[nx][ny] == 0):
                    dist[nx][ny] = dist[cur_x][cur_y] + 1
                    queue.append((nx,ny))
        
    bfs(0,0)
    return dist[n-1][m-1] if dist[n-1][m-1] != 0 else -1
        