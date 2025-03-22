from collections import defaultdict

def solution(strArr):
    answer = defaultdict(int)
    
#     for i in range(31):
#         answer[i] = 0

#     for str in strArr:
#         key = len(str)
#         if(key in answer):
#             answer[key] += 1
#         else:
#             answer[key] = 1
            
    for str in strArr:
        key = len(str)
        answer[key] += 1

    return max(answer.values())

from collections import defaultdict


