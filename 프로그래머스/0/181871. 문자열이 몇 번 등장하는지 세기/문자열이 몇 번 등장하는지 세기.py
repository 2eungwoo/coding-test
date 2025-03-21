def solution(myString, pat):
    count = 0
    pat_len = len(pat)
    window = myString[:pat_len]  

    for i in range(len(myString)):
        window = myString[i:i+pat_len]
        if(window == pat):
            count += 1
            
    return count