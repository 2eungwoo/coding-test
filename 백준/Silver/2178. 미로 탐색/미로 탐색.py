# n세로, m가로
# 4 6 
# 101111
# 101010
# 101011
# 111011

from collections import deque

n, m = map(int, input().split())
miro = [list(map(int,input().strip())) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x,y):
    q = deque()
    q.append((x,y))
    
    while(q):
        x,y = q.popleft()
        
        for dir in range(4):
            nx = x + dx[dir]
            ny = y + dy[dir]
            
            if(0 <= nx < n and 0 <= ny < m and miro[nx][ny] == 1):
                miro[nx][ny] = miro[x][y] + 1
                q.append((nx,ny))
                

bfs(0,0)
print(miro[n-1][m-1])

    
    