def solution(n_str):
    answer = ''
    idx = 0
    for i,c in enumerate(n_str):
        if(c != '0'):
            idx = i
            break
    
    return n_str[idx:]