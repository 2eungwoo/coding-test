n, target = map(int,input().split())
nums = list(map(int, input().split()))

# 누적합 구할거임
# 정확히 몇 개를 더할지 모르기 때문에 right을 하나씩 늘려가면서 누적합 할거임
# 그러다가 right이 n보다 커지면 끝에 도달하고 다음꺼 조회니까 그 때는 탈출

left, right = 0, 1
cnt = 0

while(right <= n and left <= right):
    sum_nums  = nums[left:right]
    total = sum(sum_nums)
    
    if(total == target):
        cnt += 1
        right +=1
    elif(total < target):
        right += 1
    else: # total > target
        left += 1

print(cnt)
