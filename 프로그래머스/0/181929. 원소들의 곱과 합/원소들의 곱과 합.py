def solution(num_list):
    answer = 0
    
    sum = 0
    mul = 1
    
    for n in num_list:
        mul *= n
        sum += n
        if(mul < sum**2):
            answer = 1
        else:
            answer = 0
        
    return answer