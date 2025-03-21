target = int(input()) # target
M = int(input()) # num of broken buttons
answer = abs(target - 100)

if M == 0:
    broken = []
else:
    broken = list(input().split())
    
for num in range(1000001):
    num_str = str(num)
    is_broken = False
    
    for n in num_str:
        if(n in broken):
            is_broken = True
            break
    
    if(not is_broken):
        answer = min(answer, len(num_str) + abs(target - num)) 

print(answer)