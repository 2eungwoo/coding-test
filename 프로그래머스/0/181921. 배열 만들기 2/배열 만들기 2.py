def solution(l, r):
    answer = []

    for i in range(l,r+1):
        flag = True
        for c in str(i):
            if(c != '5' and c != '0'):
                flag = False
                break
        if(flag):
            answer.append(i)
        
    if(not answer):
        answer.append(-1)

    return answer