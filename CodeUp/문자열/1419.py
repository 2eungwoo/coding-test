str = input()

cnt = 0
left = 0

for i in range(len(str)):
    if(str[i] == "l" and str[i+1] == "o" and str[i+2] == "v" and str[i+3] == "e"):
        cnt += 1

print(cnt)
