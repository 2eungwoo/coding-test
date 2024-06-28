m = int(input())
n = int(input())

prime_numbers = []

for val in range(m,n+1):
    
    if(val == 1):
        continue
    
    if(val > 1):
        flag = False
        for j in range(2,val):
            if(val % j == 0):
                flag = True
                break
        
        if(flag == False):
            prime_numbers.append(val)
            
if(len(prime_numbers) > 0):
    print(sum(prime_numbers))
    print(min(prime_numbers))
else:
    print(-1)