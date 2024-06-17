n,m = map(int, input().split())
list = [0] * (n+1)

for _ in range(m):
    i,j,k = map(int, input().split())
    for x in range(i,j+1):
        list[x] = k
        
list.remove(0)       
for val in list:
    print(val,end=" ")