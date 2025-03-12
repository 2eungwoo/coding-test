def solution(my_string, s, e):
    answer = ''
    string_list = list(my_string)
    while(s < e):
        string_list[s], string_list[e] = string_list[e], string_list[s]
        
        s = s+1
        e = e-1
    
    
    return ''.join(string_list)