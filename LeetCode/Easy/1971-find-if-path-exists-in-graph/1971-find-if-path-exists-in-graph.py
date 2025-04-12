class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        
        # 그래프의 인접 리스트 생성
        graph = {}     
        for i in range(n):
            graph[i] = [] 
        
        # 정점 연결 
        for u,v in edges: 
            graph[u].append(v)
            graph[v].append(u)
    
        queue = deque([source])
        visited = [False] * n
        visited[source] = True
        
        # bfs
        while(queue):
            cur = queue.popleft()

            if(cur == destination):
                return True
        
            for next in graph[cur]:
                if(not visited[next]):
                    visited[next] = True
                    queue.append(next)
            
        return False

