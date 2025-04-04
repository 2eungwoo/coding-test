class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:

        res = []
        visited = [False] * (n+1)

        def dfs(start,path,k):
            if(k == 0):
                res.append(path[:])
                return

            for i in range(start, n+1):
                if(not visited[i]):
                    visited[i] = True
                    dfs(i+1, path+[i], k-1)
                    visited[i] = False

            
        dfs(1,[],k)
        return res


    