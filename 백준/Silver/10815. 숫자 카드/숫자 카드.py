import sys

input = sys.stdin.readline
n = int(input())
cards = list(map(int,input().split()))
m = int(input())
nums = list(map(int,input().split()))
answer = []
cards.sort()

for target in nums:
    
    left, right = 0, len(cards)-1
    found = False
    while(left <= right):
        
        mid = (left+right)//2
        if(cards[mid] == target):
            found = True
            break
        elif(cards[mid] < target):
            left = mid + 1
        else:
            right = mid - 1
        
    if(found):
        answer.append(1)
    else:
        answer.append(0)
        
print(*answer)
        