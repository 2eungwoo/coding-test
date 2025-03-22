def solution(arr, k):
    answer = []
    
    for n in arr:
        if n in answer:
            continue
        if len(answer) == k:
            break
        answer.append(n)
            
    return answer + [-1] * (k - len(answer))
