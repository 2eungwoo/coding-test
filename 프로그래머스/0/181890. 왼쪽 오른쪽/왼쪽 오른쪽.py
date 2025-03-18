def solution(str_list):
    answer = []
    
    for i,c in enumerate(str_list):
        if(c == 'l'):
            answer = str_list[:i]
            break
        elif(c == 'r'):
            answer = str_list[i+1:]
            break
            
    return [] if not answer else answer
            