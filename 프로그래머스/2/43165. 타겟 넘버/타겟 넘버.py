def solution(numbers, target):
    
    memo = {}
    
    def dfs(idx, cur_sum):
        if(idx == len(numbers)):
            if(cur_sum == target):
                return 1
            return 0
        
        if((idx, cur_sum) in memo):
            return memo[(idx,cur_sum)]
        
        plus = dfs(idx + 1, cur_sum + numbers[idx])
        minus = dfs(idx + 1, cur_sum - numbers[idx])
        
        memo[(idx, cur_sum)] = plus + minus
        return memo[(idx, cur_sum)]
        
    return dfs(0,0)
    