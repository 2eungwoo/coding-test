n = int(input())

stack = []
visible = []

# 자신을 볼 수 있는 소를 기준으로 하자 ( << 방향으로 접근하기 위해 )
for i in range(n):
    height = int(input())

    # 자기보다 크거나 같으면 못본다했음
    while(stack):
        if(stack[-1] <= height):
            stack.pop()
        else:
            visible.append(len(stack))
            break
    
    # Push the current cow onto the stack
    stack.append(height)

print(sum(visible))
