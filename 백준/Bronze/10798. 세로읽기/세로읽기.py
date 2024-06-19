list = [''] * 5

for i in range(5):
    list[i] = input()
    
for i in range(15):
    for j in range(5):
        if(i<len(list[j]) and list[j][i] != '\0'):
            print(list[j][i],end="")
        