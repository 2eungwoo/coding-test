n = int(input())

def num(n):
    
    if(n == 1):
        return
    
    if(n % 2 == 1):
        n = 3*n + 1
        print(n)
        num(n)
        
    elif(n % 2 == 0):
        n = n//2
        print(n)
        num(n)
      
print(n)  
num(n)
