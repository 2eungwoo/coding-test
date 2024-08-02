str = input()
stack = []

for c in str:
    if(c == '('):
        stack.append(c)
    
    elif(c == ')'):
        if(stack and stack[-1] == '('):
            stack.pop()
            
        elif(not stack):
            stack.append(c)
            
    
if(len(stack) == 0):
    print("good")
else:
    print("bad")
