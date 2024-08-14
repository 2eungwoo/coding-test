import sys

n = int(input())
people = list(map(int,input().split()))
# [3,1,4,3,2]

people.sort()
dense_sum = 0
res = [0] * 1001

for i in range(len(people)):
    dense_sum += people[i]
    res[i] = dense_sum

print(sum(res))
        
    