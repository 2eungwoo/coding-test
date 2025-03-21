def solution(arr, k):
    answer = []
    
    for n in arr:
        if(k % 2 == 0):
            answer.append(n + k)
        else:
            answer.append(n * k)
    
    return answer