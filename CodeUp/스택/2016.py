n = int(input())
number = input()
stack = []

for i in number:
    stack.append(i)
    
new_num = []
cnt = 0
if(len(stack) > 3):
    while(stack):
        new_num.append(stack.pop())
        cnt += 1
        
        if(cnt == 3 and stack):
            new_num.append(',')
            cnt = 0
           
    result = reversed(new_num) 
    print(''.join(list(result)))
else: # len(stack) <= 3
    print(number)
