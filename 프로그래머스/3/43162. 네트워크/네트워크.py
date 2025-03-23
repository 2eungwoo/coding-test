def solution(n, computers):
    
    network_cnt = 0
    rows = len(computers)
    visited = [False] * rows
    
    def dfs(x):
        if(visited[x]):
            return
        
        visited[x] = True
        
        for y in range(rows):
            if(computers[x][y] == 1 and not visited[y]):
                dfs(y)
            
            
    for i in range(rows):
        if(not visited[i]):
            dfs(i)
            network_cnt += 1
            
    return network_cnt
    
