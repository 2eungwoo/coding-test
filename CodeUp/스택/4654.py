# 5
# 6 9 5 7 4
n = int(input())
towers = list(map(int, input().split()))
stack = []
res = []

for i,h in enumerate(towers):
    
    while(stack):
        if(h > stack[-1][1]): # 송신 안될 때, 작은애들은 필요없으니 팝
            stack.pop()
            
        else: # 송신 될 때
            res.append(stack[-1][0]+1)
            break
            
        
    if(not stack):
        res.append(0)
        
    stack.append((i,h))
    
    
print(*res)
