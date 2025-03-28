def addZeroToCols(arr, rows, cols):
    cnt = rows - cols
    for i in range(cnt):
        for row in arr:
            row.append(0)
    return arr

def addZeroToRows(arr, rows, cols):
    cnt = cols - rows
    for i in range(cnt):
        arr.append([0] * cols)
    return arr

def solution(arr):
    answer = []
    rows, cols = len(arr), len(arr[0])
    
    if rows > cols:
        arr = addZeroToCols(arr, rows, cols)
    elif cols > rows:
        arr = addZeroToRows(arr, rows, cols)
    
    return arr
