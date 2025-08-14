n = int(input())
scores = list(map(int,input().split()))

max = -99999
for s in scores:
    if(s > max):
        max = s
        
#  ==>> max(scores)
        
new_scores = []
for s in scores:
    new_s = s/max*100
    new_scores.append(new_s)
    
print(sum(new_scores)/n)