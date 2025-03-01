def solution(arr):
    answer = []
    
    for n in arr:
        if(not answer):
            answer.append(n)
        
        if(answer[-1] == n):
            continue
        else:
            answer.append(n)
    
    return answer