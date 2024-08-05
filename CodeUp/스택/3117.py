n = int(input())
stack = []

for i in range(n):
    num = int(input())
    
    if(not stack):
        if(num == 0):
            continue
        else:
            stack.append(num)
    else: # if stack
        if(num == 0):
            stack.pop()
        else:
            stack.append(num)
    
print(sum(stack))
