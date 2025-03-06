def solution(n):
    answer = 0
    
    for i in range(n+1):
        if(n % 2 == 0):
            if(i % 2 == 0):
                answer += i*i
        else:
            if(i % 2 != 0):
                answer += i

    return answer