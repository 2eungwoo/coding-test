class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        if not grid:
            return 0

        height = len(grid)
        width = len(grid[0])
        # directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        dx = [-1,0,1,0]
        dy = [0,1,0,-1]
        result = 0

        def dfs(y, x):
            # Mark the current land as visited
            grid[y][x] = '0'
            
            for dir in range(4):
                nx = x + dx[dir]
                ny = y + dy[dir]
            #for dy, dx in directions:
             #   ny, nx = y + dy, x + dx
                if 0 <= ny < height and 0 <= nx < width and grid[ny][nx] == '1':
                    dfs(ny, nx)

        for i in range(height):
            for j in range(width):
                if grid[i][j] == '1':
                    dfs(i, j)
                    result += 1

        return result