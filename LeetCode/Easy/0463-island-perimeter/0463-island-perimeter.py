class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        dx, dy = [1, 0, -1, 0], [0, -1, 0, 1]
        visited = [[False] * cols for _ in range(rows)]
        perimeter = 0

        def bfs(x, y):
            nonlocal perimeter
            queue = deque()
            queue.append((x, y))
            visited[x][y] = True

            while queue:
                cur_x, cur_y = queue.popleft()

                for dir in range(4):
                    nx, ny = cur_x + dx[dir], cur_y + dy[dir]

                    if(0 <= nx < rows and 0 <= ny < cols):
                        if(grid[nx][ny] == 0):
                            perimeter += 1
                        elif(not visited[nx][ny] and grid[nx][ny] == 1):
                            visited[nx][ny] = True
                            queue.append((nx, ny))
                    else:
                        perimeter += 1

        for r in range(rows):
            for c in range(cols):
                if(grid[r][c] == 1 and not visited[r][c]):
                    bfs(r, c)
                    

        return perimeter