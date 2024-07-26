n, m = map(int, input().split())
payment = list(map(int, input().split()))
# n=5, m=3
# payment = [10 20 30 20 10]

# 연속적으로 근무해야하니까(요소에 연속적 접근) 그룹으로 묶어서 진행해야하므로 슬라이딩 윈도우를 떠올릴 수 있음
# 예를들어 [2 3 4]가 현재 sum이면, 다음 sum은 [3 4 5]에서 [2]를 뺴는 것
# 즉, 현재요소의 합에서 다음요소의 합을 해준 다음에 맨 왼쪽 요소를 지워주면 됨 

sum = sum(payment[:m])

res = sum
for i in range(m,n):
    sum += payment[i] - payment[i-m]
    res = max(res, sum)
    
print(res)