def solution(arr, query):
    for i,n in enumerate(query):
        if(i % 2 == 0):
            arr = arr[:n+1]
        else:
            arr = arr[n:]
    
    return arr


