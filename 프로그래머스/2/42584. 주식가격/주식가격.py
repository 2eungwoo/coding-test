def solution(prices):
    answer = []
    n = len(prices)
    
    for i in range(n):
        diff = 0
        for j in range(i+1,n):
            diff += 1
            if(prices[i] > prices[j]):
                break
        answer.append(diff)
        
    return answer
            
      