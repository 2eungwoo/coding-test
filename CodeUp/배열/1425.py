# 입력 예시   
# 9 6
# 160 165 164 165 150 165 168 145 170 

# 출력 예시
# 145 150 160 164 165 165 
# 165 168 170 

n,m = map(int,input().split())
students = list(input().split())

students.sort()

for i in range(0,n,m):
    print(*students[i:i+m])
