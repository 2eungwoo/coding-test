n = int(input())
arr = list(map(int,input().split()))
k = int(input())

left, right = 0, 1
cur_sum = 0

prefix_sum = [0] * (n+1)
for i in range(1,n+1):
    prefix_sum[i] = prefix_sum[i-1] + arr[i-1]

cnt = 0
while(left <= right and right <= len(arr)):
    cur_sum = prefix_sum[right] - prefix_sum[left]
    
    if(cur_sum > k):
        cnt += (n - right + 1) 
        left += 1
    
    else:
        right += 1
    
print(cnt)
    

