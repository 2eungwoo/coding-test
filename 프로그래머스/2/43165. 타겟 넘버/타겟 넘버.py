def solution(numbers, target):
    answer = 0
    
    def dfs(idx, cur_sum):
        nonlocal answer
        
        if(idx == len(numbers)):
            if(cur_sum == target):
                answer += 1
            return
        
        else:
            dfs(idx + 1, cur_sum + numbers[idx])
            dfs(idx + 1, cur_sum - numbers[idx])
        
    dfs(0,0)
    return answer
        