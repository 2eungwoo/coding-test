n, m = map(int, input().split())
list = []

for i in range(n+1):
    list.append(i)

def swap(a,b):
    tmp = list[a]
    list[a] = list[b]
    list[b] = tmp
    
for _ in range(m):
    i,j = map(int,input().split())
    swap(i,j)
    
    
list.pop(0)
for val in list:
    print(val,end=" ")