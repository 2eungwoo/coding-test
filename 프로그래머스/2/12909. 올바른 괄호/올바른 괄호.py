def solution(s):
    stack = []
    
    for i in range(len(s)):
        
        if(not stack):
            stack.append(s[i])
        elif(stack and stack[-1] == '('): # 얘를 if로 분기하면 안됨...실수주의
            if(s[i] == '('):
                stack.append(s[i])
            else: # s[i] == ')'
                stack.pop()
            
    if(not stack):
        return True
    else:
        return False
    
    

        