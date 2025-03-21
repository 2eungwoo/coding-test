def solution(str1, str2):
    answer = 0
    
    window = str2[:len(str1)]
    
    for i in range(len(str2)):
        window = str2[i:i+len(str1)]
        if(window == str1):
            return 1
    
    return answer