import math 

def solution(progresses, speeds):

    work_days = []
    for i in range(len(progresses)):
        work_days.append(math.ceil((100 - progresses[i]) / speeds[i]))

    # print("work days:", work_days)
    answer = []
    window = [work_days[0]]

    # work days: [5, 10, 1, 1, 20, 1]
    for i in range(1,len(progresses)): 

        if(work_days[i] > window[0]):
            answer.append(len(window))
            window = [work_days[i]]
        else:
            window.append(work_days[i])
            
    if(window):
        answer.append(len(window))
        
    return answer
    