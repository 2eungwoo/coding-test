import sys
input = sys.stdin.readline

s = int(input())

# 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
sum = 0
cnt = 0
for i in range(1,s+1):
    sum += i
    cnt += 1
    if(sum > s):
        cnt -= 1
        break
    
print(cnt)


