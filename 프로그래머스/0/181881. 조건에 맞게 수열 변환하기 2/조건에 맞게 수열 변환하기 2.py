def solution(arr):
    answer = 0
    old = arr
    while(1):
        new = []
        for n in old:
            if(n >= 50 and n % 2 == 0):
                n = n//2
            elif(n < 50 and n % 2 != 0):
                n = n * 2 + 1
            new.append(n)
        if(old == new):
            break
        else:
            old = new
            answer += 1

    return answer