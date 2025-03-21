def solution(strArr):
    answer = []
    
    for i,c in enumerate(strArr):
        if('ad' in c):
            continue
        else:
            answer.append(c)
    
    return answer