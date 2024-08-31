# n세로 m가로
# 6 4
# 0100
# 1110
# 1000
# 0000
# 0111
# 0000


import sys
from collections import deque

n,m = map(int,input().split())
miro = [list(map(int,input().strip())) for _ in range(n)]

# x,y,stats : 0 벽안뿌, 1 벽뿌
visited = [[[0,0] for _ in range(m)] for _ in range(n)]
visited[0][0][0] = 1 # 시작점 센다고 했으니까 1값 처리

dx = [0,1,0,-1]
dy = [1,0,-1,0]

def bfs(x,y):
    q = deque([(x,y,0)]) # x,y,벽뿌 여부(안부순상태 시작)
    
    while(q):
        x,y,status = q.popleft()
        
        if(x == n-1 and y == m-1):
            return visited[x][y][status]
    
        for dir in range(4):
            nx, ny = x + dx[dir], y + dy[dir]
            
            if(0 <= nx < n and 0 <= ny < m):
                
                # 다음칸이 벽 아니고, 아직 방문 안했을 떄. normal case
                if(miro[nx][ny] == 0 and visited[nx][ny][status] == 0):
                    visited[nx][ny][status] = visited[x][y][status] + 1
                    q.append((nx,ny,status))
                
                # 다음 칸이 벽이고, 벽뿌 가능할 때 탐색 ( 벽뿌 가능하게 했으니 벽뿌 여부 변경 0->1 )
                if(miro[nx][ny] == 1 and status == 0 and visited[nx][ny][1] == 0):
                    visited[nx][ny][1] = visited[x][y][status] + 1
                    q.append((nx,ny,1))

    return -1             


print(bfs(0,0))


