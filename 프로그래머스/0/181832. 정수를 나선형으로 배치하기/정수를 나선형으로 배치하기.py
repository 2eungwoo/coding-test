def solution(n):
    arr = [[0] * n for _ in range(n)]
    num = 1
    x, y = 0, 0
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    dir = 0
    
    stack = [(x, y, num, dir)]
    
    while stack:
        x, y, num, dir = stack.pop()
        arr[x][y] = num # 방문
        num += 1
        
        nx, ny = x + dx[dir], y + dy[dir]
        
        if(nx < 0 or nx >= n or ny < 0 or ny >= n or arr[nx][ny] != 0):
            dir = (dir + 1) % 4 # 우->하->좌->상
            nx, ny = x + dx[dir], y + dy[dir]
        
        if(num <= n*n):
            stack.append((nx, ny, num, dir))
    
    return arr
