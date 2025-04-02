import sys

input = sys.stdin.readline
rows, cols = map(int, input().split())
# grid = []
# for _ in range(rows):
#     grid.append(input().strip())
grid = [list(input().strip()) for _ in range(rows)]

dx = [1,0,-1,0]
dy = [0,-1,0,1]
dist = 1
setqueue = set()

def bfs(x,y):
    global dist
    setqueue.add((x, y, grid[x][y]))

    while(setqueue):
        cur_x, cur_y, path = setqueue.pop()

        for i in range(4):
            nx, ny = cur_x + dx[i], cur_y + dy[i]
            if(0 <= nx < rows and 0 <= ny < cols and grid[nx][ny] not in path):
                setqueue.add((nx, ny, path + grid[nx][ny]))
                dist = max(dist, len(path)+1)

bfs(0,0) 
print(dist) 