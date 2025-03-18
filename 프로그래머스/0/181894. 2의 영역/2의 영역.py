def solution(arr):
    answer = []
    st, en = 0, len(arr) - 1
    
    for i in range(len(arr)):
        if(arr[i] == 2):
            st = i
            break
    
    for i in range(len(arr) - 1, -1, -1):
        if(arr[i] == 2):
            en = i
            break
    
    for n in arr[st:en+1]:
        if(n == 2):
            answer.append(1)
    
    return arr[st:en+1] if answer else [-1]
