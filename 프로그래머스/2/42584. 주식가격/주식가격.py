def solution(prices):
#     answer = []
#     n = len(prices)
    
#     for i in range(n):
#         diff = 0
#         for j in range(i+1,n):
#             diff += 1
#             if(prices[i] > prices[j]):
#                 break
#         answer.append(diff)
        
#     return answer
    n = len(prices)
    answer = [0] * n
    stack = []
    
    for i in range(n):
        while(stack and prices[i] < prices[stack[-1]]):
            j = stack.pop()
            answer[j] = i - j
            
        stack.append(i)

    while(stack):
        j = stack.pop()
        answer[j] = n-j-1
        
    return answer
            
      