def solution(my_string, target):
    answer = 0
    
    window = my_string[:len(target)]
    
    for i in range(len(my_string)):
        window = my_string[i:i+len(target)]
        if(window == target):
            return 1
    
    return answer