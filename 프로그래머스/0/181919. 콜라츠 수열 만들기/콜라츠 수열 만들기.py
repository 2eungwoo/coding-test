def solution(n):
    answer = []
    answer.append(n)
    
    while(1):
        if(n % 2 == 0):
            n //= 2
            answer.append(n)
        else:
            n = 3 * n + 1
            answer.append(n)
        
        if(answer[-1] == 1):
            break
        
    
    return answer