import sys
input = sys.stdin.readline

n = int(input())

if(n==0):
    print(0)
else:
    list = []
    for _ in range(n):
        list.append(int(input()))
    list.sort()
    k = round(n * 0.15 + 0.0000001)
    sum = sum(list[k:n-k])
    bunmo = n-2*k
    result = round(sum/bunmo + 0.0000001)
    # print(sum/bunmo)
    # print(sum//bunmo)
    # print(f"{sum}/{bunmo} = {result}")
    print(result)
