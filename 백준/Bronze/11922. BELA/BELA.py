a, b = map(str, input().split())
n = int(a)

result = 0
for _ in range(4 * n):
    temp = input()

    if temp[0] == 'A':
        result += 11
    elif temp[0] == 'K':
        result += 4
    elif temp[0] == 'Q':
        result += 3
    elif temp[0] == 'J':
        # dominant
        if temp[1] == b:
            result += 20
        # not dominant
        else:
            result += 2
    elif temp[0] == 'T':
        result += 10
    elif temp[0] == '9':
        # dominant
        if temp[1] == b:
            result += 14
    # cases '8' and '7' do nothing
print(result)
