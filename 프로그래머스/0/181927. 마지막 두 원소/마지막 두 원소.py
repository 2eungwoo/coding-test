def solution(num_list):
    answer = num_list
    last_idx = len(num_list)-1
    if(num_list[last_idx] > num_list[last_idx-1]):
        answer.append(num_list[last_idx]-num_list[last_idx-1])
    else:
        answer.append(num_list[last_idx]*2)
    
    return answer