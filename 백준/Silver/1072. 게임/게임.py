import sys
input = sys.stdin.readline
# 이제 절대 안짐
# x와 y는 항상 동일하게 증가
# z가 변했다 -> 승률이 올랐다.

x,y = map(int,input().split())
z = int((y * 100)//x)

left, right = 0,1000000000
answer = -1

def search(left, right):
    global answer
    
    while(left <= right):
        mid = (left + right)//2
        new_z = ((y + mid) * 100) // (x + mid)

        if(new_z > z):
            answer = mid
            right = mid - 1
        else:
            left = mid + 1

    return answer
    
if(x == y):
    print(-1)
else:
    print(search(left,right))