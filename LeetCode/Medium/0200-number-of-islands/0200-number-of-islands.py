class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        rows, cols = len(grid), len(grid[0])      
        dx = [1,0,-1,0]
        dy = [0,-1,0,1]
        cnt = 0

        if not grid:
            return 0

        def dfs(x, y):
            
            stack = [(x, y)]
            
            while(stack):
                cur_x, cur_y = stack.pop()
        
                grid[cur_x][cur_y] = "V"

                for i in range(4):
                    nx, ny = cur_x + dx[i], cur_y + dy[i]
                    if(0 <= nx < rows and 0 <= ny < cols and grid[nx][ny] == "1"):
                        stack.append((nx,ny))

    
        for i in range(rows):
            for j in range(cols):
                if(grid[i][j] == "1"):
                    dfs(i,j)
                    cnt += 1

        return cnt