n = int(input())

# n개, 1st, 2nd, 3rd
def hanoi(n, st, mid, dest):

    if(n == 1):
        print(st,dest,sep=" ")
        return
    
    # 원판이동(n-1개) 1st -> 2nd. start:st, destination:mid 
    hanoi(n-1, st, dest, mid)
    # 원판이동(마지막1개) 1st -> 3rd. start:st, destination:dest
    hanoi(1, st, mid, dest)
    # 원판이동(n-1개) 2nd -> 3rd. start:mid, destination:dest
    hanoi(n-1,mid ,st ,dest)

    
print(2**n-1)
if(n <= 20):
    hanoi(n,1,2,3)
