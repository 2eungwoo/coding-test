a,b = map(int, input().split())

def func(a,b):
    if(a > b):
        return

    if(a % 2 != 0):
        print(a,end=" ")
        
    func(a+1,b)

func(a,b)
