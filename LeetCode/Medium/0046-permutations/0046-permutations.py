class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        
        n = len(nums)
        res = []
        visited = [False] * n

        def dfs(path):
            if(len(path) == n):
                res.append(path[:])
                return

            for i in range(n):
                if(not visited[i]):
                    visited[i] = True
                    dfs(path + [nums[i]])
                    visited[i] = False

        dfs([])
        return res