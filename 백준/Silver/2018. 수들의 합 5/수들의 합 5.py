import sys
input = sys.stdin.readline

n = int(input())

start, end = 1, 1
cur_sum = 1
cnt = 0

while True:
    if(cur_sum == n):
        cnt += 1
        cur_sum -= start
        start += 1
    elif(cur_sum > n):
        cur_sum -= start
        start += 1
    elif(cur_sum < n):
        if(end == n):
            break
        end += 1
        cur_sum += end
            
print(cnt)
