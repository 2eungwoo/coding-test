n = int(input())
list = list(map(int, input().split()))
v = int(input())
cnt = 0

for i in range(n):
    if list[i]==v:
        cnt += 1
        
print(cnt)