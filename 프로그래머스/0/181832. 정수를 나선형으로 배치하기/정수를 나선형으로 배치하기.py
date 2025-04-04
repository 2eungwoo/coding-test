# def solution(n):
#     arr = [[0] * n for _ in range(n)]
#     num = 1
#     x, y = 0, 0
#     dx = [0, 1, 0, -1]
#     dy = [1, 0, -1, 0]
#     dir = 0
    
#     stack = [(x, y, num, dir)]
    
#     while stack:
#         x, y, num, dir = stack.pop()
#         arr[x][y] = num # 방문
#         num += 1
        
#         nx, ny = x + dx[dir], y + dy[dir]
        
#         if(nx < 0 or nx >= n or ny < 0 or ny >= n or arr[nx][ny] != 0):
#             dir = (dir + 1) % 4 # 우->하->좌->상
#             nx, ny = x + dx[dir], y + dy[dir]
        
#         if(num <= n*n):
#             stack.append((nx, ny, num, dir))
    
#     return arr

def solution(n):
    arr = [[0] * n for _ in range(n)]
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    

    def dfs():
        stack = [(0, 0, 1, 0)]  # x,y,num,dir

        while(stack):
            x, y, num, dir = stack.pop()
            arr[x][y] = num

            if(num >= n*n):
                continue

            for i in range(4):
                ndir = (dir + i) % 4
                nx, ny = x + dx[ndir], y + dy[ndir]

                if(0 <= nx < n and 0 <= ny < n and arr[nx][ny] == 0):
                    stack.append((nx, ny, num + 1, ndir)) 
                    break # 모든 방향 다 가는게 아니고 한 방향만 가는거니까 멈춰줘야됨

    dfs()
    return arr