# 전공평점 = (몇학점짜린지*받은등급(의점수))/(몇학점짜린지합)
sum = 0
result = 0

dic = {'A+':4.5, 'A0':4.0, 'B+':3.5, 'B0':3.0,
       'C+':2.5, 'C0':2.0, 'D+':1.5, 'D0':1.0,
       'F':0.0}

for _ in range(20):
    subject, score, rank = input().split()
    if(rank == 'P'):
        continue
    sum += float(score)
    result += float(score) * dic[rank]
    
print(format(result/sum,'.6f'))
