class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        
        memo = {}

        def dfs(idx, cur_sum):
            if(idx == len(nums)):
                if(cur_sum == target):
                    return 1
                else:
                    return 0


            if((idx, cur_sum) in memo):
                return memo[(idx, cur_sum)]

            plus = dfs(idx+1, cur_sum+nums[idx])
            minus = dfs(idx+1, cur_sum-nums[idx])

            memo[(idx, cur_sum)] = plus+minus

            return memo[(idx,cur_sum)]
        
        
        return dfs(0,0)
        