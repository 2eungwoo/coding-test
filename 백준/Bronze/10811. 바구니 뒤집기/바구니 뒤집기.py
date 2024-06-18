n,m = map(int,input().split())

list = [x for x in range(1,n+1)]

for _ in range(m):
    i,j = map(int,input().split())
    tmp = list[i-1:j]
    tmp.reverse()
    list[i-1:j] = tmp
     
print(*list)