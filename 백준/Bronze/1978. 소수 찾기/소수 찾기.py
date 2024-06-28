n = int(input())
numbers = list(map(int,input().split()))
cnt = 0

for val in numbers:
    
    if(val == 1):
        continue
    
    if(val > 1):
        flag = False
        for j in range(2,val):
            if(val % j == 0):
                flag = True
                break
            
        if(flag == False):
            cnt += 1
            
print(cnt)
