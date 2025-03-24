def solution(picture, k):
    answer = []
    
    for i in range(len(picture)):
        char = ''
        for j in picture[i]:
            char += j*k
        for _ in range(k):
            answer.append(char)
            
    return answer
