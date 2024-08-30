from collections import deque

n, m = map(int, input().split())
board = [input().strip() for _ in range(m)]
vis = [[False] * n for _ in range(m)]
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
sumW, sumB = 0, 0

def bfs(i, j):
    cnt = 1
    q = deque([(i, j)])
    vis[i][j] = True
    sameTeam = board[i][j]
    while q:
        x, y = q.popleft()
        for dir in range(4):
            nx, ny = x + dx[dir], y + dy[dir]
            if 0 <= nx < m and 0 <= ny < n and not vis[nx][ny] and board[nx][ny] == sameTeam:
                q.append((nx, ny))
                vis[nx][ny] = True
                cnt += 1
    return cnt * cnt

for i in range(m):
    for j in range(n):
        if not vis[i][j]:
            if board[i][j] == 'W':
                sumW += bfs(i, j)
            elif board[i][j] == 'B':
                sumB += bfs(i, j)

print(sumW)
print(sumB)