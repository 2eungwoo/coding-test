# 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
# 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
# 3: 스택에 들어있는 정수의 개수를 출력한다.
# 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
# 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.

# 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
# 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
# 출력을 요구하는 명령은 하나 이상 주어진다.
import sys

n = int(sys.stdin.readline())
stk = []

for _ in range(n):
    command = sys.stdin.readline().split()
    
    if(command[0] == '1'):
        stk.append(command[1])
        
    elif(command[0] == '2'):
        if(stk):
            print(stk.pop())
        else:
            print(-1)
    elif(command[0] == '3'):
        print(len(stk))
    elif(command[0] == '4'):
        if(stk):
            print(0)
        else:
            print(1)
    elif(command[0] == '5'):
        if(stk):
            print(stk[-1])
        else:
            print(-1)
