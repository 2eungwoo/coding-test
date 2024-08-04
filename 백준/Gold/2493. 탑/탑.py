n = int(input())
towers = list(map(int, input().split()))
stack = []
res = []

for idx, height in enumerate(towers):

    # 높이가 같으면 수신 안된다고 가정
    while(stack):
        if(height >= stack[-1][1]):
            stack.pop()
        else:
            # print(stack[-1][0]+1,end=" ")
            res.append(stack[-1][0]+1)
            break

    # 첫번째 타워는 반드시 0이므로 여기 분기에 먼저 걸려야됨. 그 다음 push
    if not stack:
        res.append(0)
        # print(0,end=" ")
        
    stack.append((idx, height))

print(*res)