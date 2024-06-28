while(1):
    n = int(input())
    if(n==-1):
        break
    
    sum = 0
    list = []
    for i in range(1,n):
        if(n % i == 0):
            list.append(i)
            sum += i
    
    if(sum != n):
        print(f"{n} is NOT perfect.")
    elif(sum == n):
        print(n, "=", end=" ")
        print(*list, sep=" + ")
 