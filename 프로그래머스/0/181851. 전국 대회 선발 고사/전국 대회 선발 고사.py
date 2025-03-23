def solution(rank, attendance):
    attended = []
    
    for i in range(len(attendance)):
        if attendance[i]:
            attended.append((rank[i], i)) 
    
    attended.sort()
    
    if len(attended) < 3:
        return -1

    return attended[0][1] * 10000 + attended[1][1] * 100 + attended[2][1]
