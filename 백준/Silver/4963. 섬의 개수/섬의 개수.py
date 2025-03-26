dx = [0, 0, -1, 1, 1, 1, -1, -1]
dy = [1, -1, 0, 0, 1, -1, -1, 1]

def dfs(x, y, h, w, grid):
    stack = [(x, y)]
    while stack:
        cur_x, cur_y = stack.pop()  
        if grid[cur_x][cur_y] == 1:
            grid[cur_x][cur_y] = 9  
    
            for dir in range(8):
                nx, ny = cur_x + dx[dir], cur_y + dy[dir]
                if 0 <= nx < h and 0 <= ny < w and grid[nx][ny] == 1:
                    stack.append((nx, ny))  

while True:
    w, h = map(int, input().split())  # cols, rows
    if w == 0 and h == 0:
        break
        
    grid = [list(map(int, input().split())) for _ in range(h)]

    cnt = 0
    for i in range(h):
        for j in range(w):
            if grid[i][j] == 1:
                dfs(i, j, h, w, grid)
                cnt += 1
        
    print(cnt)