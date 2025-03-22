def solution(arr, delete_list):
    answer = []
    
    for i in range(len(arr)):
        if(arr[i] in delete_list):
            continue
        answer.append(arr[i])
    return answer