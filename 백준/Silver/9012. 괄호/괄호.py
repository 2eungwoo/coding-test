n = int(input())

for _ in range(n):
    str = input()
    stack = []
    
    for c in str:
        if c == '(':
            stack.append(c)
        elif c == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(c)
                
    if len(stack) == 0:
        print("YES")
    else:
        print("NO")
