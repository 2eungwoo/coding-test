# def solution(arr, idx):
#     answer = []
    
#     for i,n in enumerate(arr):
#         if(i >= idx and n == 1):
#             answer.append(i)
        
#     return -1 if not answer else min(answer)
# => O(N) + O(N)

def solution(arr, idx):
    answer = -1
    
    for i,n in enumerate(arr):
        if(i >= idx and n == 1):
            answer = i
            break
        
    return answer
# => O(N)

