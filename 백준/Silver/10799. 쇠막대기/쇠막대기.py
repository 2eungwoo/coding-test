brace = input()
stack = []
cnt = 0

for i,v in enumerate(brace):
    if(v == '('):
        stack.append(v)
    else:
        if(brace[i-1] == '('):
            stack.pop()
            cnt += len(stack)    
        else: #brack[i-1] == ')' 
            stack.pop()
            cnt += 1

print(cnt)
