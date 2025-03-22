def solution(str_list, ex):
    answer = ''
    
    for i,c in enumerate(str_list):
        if(ex not in c):
            answer += c
    return answer