# 7
# 0110100
# 0110101
# 1110101
# 0000111
# 0100000
# 0111110
# 0111000
    
from collections import deque

n = int(input())
grid = list(list(map(int,input().strip())) for _ in range(n))
vis = list([False]*n for _ in range(n))

dx = [0,1,0,-1]
dy = [1,0,-1,0]

def bfs(x,y):
    q = deque([(x,y)])
    vis[x][y] = True
    
    cnt = 1
    
    while(q):
        cur_x, cur_y = q.popleft()
        
        for dir in range(4):
            nx, ny = cur_x + dx[dir], cur_y + dy[dir]
            if(0 <= nx < n and 0 <= ny < n and grid[nx][ny] == 1 and vis[nx][ny] == False):
                q.append((nx,ny))
                vis[nx][ny] = True
                cnt += 1
    
    return cnt

res = []
for i in range(n):
    for j in range(n):
        if(grid[i][j] == 1 and vis[i][j] == False):
            res.append(bfs(i,j))
            
            
res.sort()
print(len(res))
print(*res,sep="\n")