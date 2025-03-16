def solution(my_string):
    answer = [0] * 52

#     answer[0] ~ answer[25] : A ... Z
#     answer[26] ~ answer[51] : a ... z
#     97 - X = 26
#     X = 71
    
    for c in my_string:   
        if(c.isupper()):
            answer[ord(c) - 65] += 1
        else:
            answer[ord(c) - 71] += 1
    
    
    return answer