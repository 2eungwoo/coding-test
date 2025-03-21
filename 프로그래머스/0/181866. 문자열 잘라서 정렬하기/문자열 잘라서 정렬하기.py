def solution(myString):
    answer = []
    
    strs = myString.split('x')
    
    for c in strs:
        if(c != ''):
            answer.append(c)
    
    return sorted(answer)