n = int(input())

def func(n):
    if(n == 1):
        print(1)
        return 1
    
    print(n)
    func(n-1)
    
func(n)
