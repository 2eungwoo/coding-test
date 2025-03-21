def solution(myString):
    answer = []
    
    strs = myString.split('x')
    
    for c in strs:
        answer.append(len(c))
            
    
    return answer