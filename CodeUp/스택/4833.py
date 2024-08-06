# ()(((()())(())()))(())
brace = input()
stack = []
cnt = 0

for i,v in enumerate(brace):
    
    if(stack):
        if(v == '('):
            stack.append(v)
        else:
            if(brace[i-1] == '('):
                stack.pop()
                cnt += len(stack)
            elif(brace[i-1] == ')'):
                cnt += 1
                stack.pop()
    else:
        if(v == '('):
            stack.append(v)
        else:
            continue

print(cnt)
