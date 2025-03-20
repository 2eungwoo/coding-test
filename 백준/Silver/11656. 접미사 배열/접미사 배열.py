str = input()
answer = []

for i in range(len(str)):
    answer.append(str[i:])

print(*sorted(answer), sep="\n")