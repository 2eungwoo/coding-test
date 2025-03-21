def solution(myString, pat):
    answer = ''
    pat_len = len(pat)
    window = myString[:pat_len]
    
    for i in range(len(myString)):
        window = myString[i:i+pat_len]
        if(window == pat):
            answer = myString[:i+pat_len]
    
    return answer 