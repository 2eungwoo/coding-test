def solution(my_string, indices):
    answer = ''
    
    for i,c in enumerate(my_string):
        if i not in indices:
            answer += c
        
    return answer