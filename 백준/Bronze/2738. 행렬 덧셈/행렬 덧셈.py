n,m = map(int, input().split())

m1 = [[0 for col in range(m)] for row in range(n)]
m2 = [[0 for col in range(m)] for row in range(n)]

for i in range(n):
    m1[i] = list(map(int, input().split()))

for i in range(n):
    m2[i] = list(map(int, input().split()))
    
for i in range(n):
    for j in range(m):
        print(m1[i][j] + m2[i][j],end=' ')
    print()
