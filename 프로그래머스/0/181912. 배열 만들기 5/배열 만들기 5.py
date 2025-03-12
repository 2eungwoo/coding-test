def solution(intStrs, k, s, l):
    answer = []
    
    for st in intStrs:
        if(int(st[s:s+l]) > k):
            answer.append(int(st[s:s+l]))
    
    return answer

