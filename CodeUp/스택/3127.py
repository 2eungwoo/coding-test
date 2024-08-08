# 1 2 3 * + 4 5 - 6 * + 

str = input().split()
stack = []

for i,v in enumerate(str):
    stack.append(v)
    
    if(stack[-1] == '*'):
        num = int(stack[-2]) * int(stack[-3])
        stack.pop() # *
        stack.pop() # stack[-2]
        stack.pop() # stack[-3]
        stack.append(num) # stack[-2] * stack[-3]
    elif(stack[-1] == '+'):
        num = int(stack[-2]) + int(stack[-3])
        stack.pop()
        stack.pop()
        stack.pop()
        stack.append(num)
    elif(stack[-1] == '-'):
        num = int(stack[-3]) - int(stack[-2])
        stack.pop()
        stack.pop()
        stack.pop()
        stack.append(num)
        
print(*stack)
