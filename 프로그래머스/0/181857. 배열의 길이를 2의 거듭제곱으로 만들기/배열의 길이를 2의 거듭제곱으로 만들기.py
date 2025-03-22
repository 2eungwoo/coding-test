def solution(arr):
    answer = []
    length = 1
    while(length < len(arr)):
        length *= 2
        
    return arr + [0] * (length - len(arr))
