from math import prod

def solution(num_list):
    answer = 0
    mul = 1
    if(len(num_list) >= 11):
        answer = sum(num_list)
    else:
        answer = prod(num_list)
        # for n in num_list:
        #     mul *= n
        # answer = mul
        
    return answer
           
