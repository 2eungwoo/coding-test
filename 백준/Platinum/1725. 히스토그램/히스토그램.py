n = int(input())
hist = [int(input()) for _ in range(n)]

stack = []
answer = 0

for i in range(n):
    
    while stack and hist[stack[-1]] > hist[i]:
        h = hist[stack.pop()] 
       
        if not stack:
            w = i
        else:
            w = i - stack[-1] - 1
            
        answer = max(answer, h * w)
    
    stack.append(i)

while stack:
    h = hist[stack.pop()]
   
    if not stack:
        w = n
    else:
        w = n - stack[-1] - 1
    
    answer = max(answer, h * w)

print(answer)
