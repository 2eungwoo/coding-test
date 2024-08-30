import sys
from collections import deque

n, m, start = map(int, input().split())
grid = [[] for _ in range(n+1)]
dfs_vis = [False] * (n+1)
bfs_vis = [False] * (n+1)

for _ in range(m):
    u,v = map(int,input().split())
    grid[u].append(v)
    grid[v].append(u)

for i in range(1,n+1):
    grid[i].sort()


def dfs(cur):
    if dfs_vis[cur]:
        return
    
    dfs_vis[cur] = True
    print(cur, end=' ')
    
    for next in grid[cur]:
        if not dfs_vis[next]:
            dfs(next)
    
def bfs(cur):
    q = deque([cur])
    bfs_vis[cur] = True
    
    while(q):
        node = q.popleft()
        print(node, end=' ')
        
        for next in grid[node]:
            if not bfs_vis[next]:
                q.append(next)
                bfs_vis[next] = True
                

dfs(start)
print()
bfs(start)
