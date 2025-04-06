import sys
input = sys.stdin.readline

n, m = map(int,input().split())

s = set()
for _ in range(n):
    word = input().strip()
    s.add(word)
# str = set(input().strip() for _ in range(n))
    
answer = 0
for _ in range(m):
    word = input().strip()
    if(word in s):
        answer += 1
        
print(answer)
