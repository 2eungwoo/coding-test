memo = {}

def super_sum(k, n):
    if(k == 0):
        return n
    
    key = str(k) + ',' + str(n)
    if key in memo:
        return memo[key]
    
    sum = 0
    for i in range(1, n+1):
        sum += super_sum(k-1, i)
        memo[key] = sum
    return memo[key]


while(1):
    try:
        k, n = map(int,input().split())
        print(super_sum(k, n))
    except EOFError:
        break

## collections.defaultdict로 하면 시간초과 걸림
