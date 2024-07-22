n = int(input())

def triangle(n):
    if(n == 1):
        print('*')
        return
    
    triangle(n-1)
    print('*'*n)

triangle(n)
