# 3
# 1000100
# 1000101
# 1110101

n = int(input())
check = [0] * 7
dic = {
    0:'월',
    1:'화',
    2:'수',
    3:'목',
    4:'금',
    5:'토',
    6:'일',
}

for i in range(n):
    str = input()
    
    for idx,c in enumerate(str):
        if(c == '1'):
            check[idx] += 1
        
#print(check)        
for i,c in enumerate(check):
    if(c == n):
        print(f"{dic[i]}요일에 가능")
    if(n not in check):
        print("다음에 만나요~")
        break
        

# 2
# 0000000
# 0000100


# 11
# 0101000
# 1101010
# 1110101
# 0110101
# 0101100
# 1100110
# 1110001
# 1110110
# 1101010
# 1100101
# 1100110
