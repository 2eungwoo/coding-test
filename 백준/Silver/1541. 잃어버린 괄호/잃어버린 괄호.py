import sys
input = sys.stdin.readline

expression = input().strip().split('-')

answer = sum(map(int, expression[0].split('+')))

for exp in expression[1:]:
    answer -= sum(map(int, exp.split('+')))

print(answer)

