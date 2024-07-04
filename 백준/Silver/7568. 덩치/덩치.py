n = int(input())
list = []
rank = [0] * n

for i in range(n):
    weight, height = map(int, input().split())
    list.append([weight,height])
    
for i in range(n):
    for j in range(n):
        if(list[i][0] < list[j][0] and list[i][1] < list[j][1]):
            rank[i] += 1
            
            
for i in range(len(rank)):
    print(rank[i]+1,end=" ")
            