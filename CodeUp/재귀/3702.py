r,c = map(int, input().split())

memo = [[0] * 51 for _ in range(51)]

def triangle(r,c):
    if(r == 1 or c == 1):
        memo[r][c] = memo[c][r] = 1
        return 1

    if(memo[r][c] != 0):
        return memo[r][c]
    else: # equation : (r,c) -> (r-1,c) + (r,c-1)
        memo[r][c] = memo[c][r] = (triangle(r-1,c) + triangle(r,c-1)) % 100000000
        return memo[r][c]
    
print(triangle(r,c))
