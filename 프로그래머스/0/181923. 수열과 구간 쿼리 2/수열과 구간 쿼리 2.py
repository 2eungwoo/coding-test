def solution(arr, queries):
    answer = []
    
    for s,e,k in queries:
        tmp = []
        for x in arr[s:e+1]:
            if(x > k):
                tmp.append(x)
        if(not tmp):
            answer.append(-1)
        else:
            answer.append(min(tmp))
            
    return answer