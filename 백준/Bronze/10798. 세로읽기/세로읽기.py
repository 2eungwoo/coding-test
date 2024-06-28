str = [''] * 5

for i in range(5):
    str[i] = input()
    
for i in range(15):
    for j in range(5):
        if(i<len(str[j])):
            print(str[j][i],end="")