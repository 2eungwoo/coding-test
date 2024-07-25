n = int(input())

def num(n):
    if(n == 1):
        return 
    
    if(n % 2 == 1):
        n = n*3 + 1
        num(n)
        print(n)
    
    elif(n % 2 == 0):
        n = n//2
        num(n)
        print(n)
    
num(n)
print(n)
