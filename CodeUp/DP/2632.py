n = int(input())

if(n == 0):
    print(0)
elif(n == 1):
    print(1)
else:
    stair = [0] * (n+1)
    stair[1] = 1
    stair[2] = 2
    
    for i in range(3, n+1):
        stair[i] = stair[i-1] + stair[i-2]
        
    print(stair[n])
