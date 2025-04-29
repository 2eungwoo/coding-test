class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        original_color = image[sr][sc]
        if(original_color == color):
            return image

        dx = [1,0,-1,0]
        dy = [0,-1,0,1]
        rows, cols = len(image), len(image[0])

        def dfs(x,y):
            image[x][y] = color

            for dir in range(4):
                nx, ny = x + dx[dir], y + dy[dir]
                if(0 <= nx < rows and 0 <= ny < cols and image[nx][ny] == original_color):
                    dfs(nx,ny)

        
        dfs(sr, sc)
        return image