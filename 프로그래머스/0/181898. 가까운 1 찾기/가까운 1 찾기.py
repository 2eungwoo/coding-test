def solution(arr, idx):
    answer = []
    
    for i,n in enumerate(arr):
        if(i >= idx and n == 1):
            answer.append(i)
        
    
    return -1 if not answer else min(answer)