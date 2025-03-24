def solution(date1, date2):
    
    date1_arr = ''
    date2_arr = ''
    
    for i in range(3):
        date1_arr += str(date1[i])
        date2_arr += str(date2[i])
        
    return 1 if int(date1_arr) < int(date2_arr) else 0