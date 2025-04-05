import sys
input = sys.stdin.readline

n = int(input())
answer = []
visited = [False] * (n+1)

def dfs(path):
    if(len(path) == n):
        answer.append(path[:])
        return
    
    for i in range(1,n+1):
        if(not visited[i]):
            visited[i] = True
            dfs(path + [i])
            visited[i] = False
    
    
    
dfs([])
    
for i in range(len(answer)):
    for j in range(len(answer[0])):
        print(answer[i][j],end=' ')
    print()
    