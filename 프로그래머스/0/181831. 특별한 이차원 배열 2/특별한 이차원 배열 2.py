def solution(arr):
 
    rows, cols = len(arr), len(arr[0])
    for i in range(rows):
        for j in range(cols):
            if(arr[i][j] != arr[j][i]):
                return 0
    
    return 1