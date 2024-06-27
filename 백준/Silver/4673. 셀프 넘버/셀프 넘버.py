# 10,000 이하

def d(n):
    return n + sum(map(int,str(n)))
    
self_num_list = set()

for i in range(1,10001):
    self_num_list.add(d(i))

for i in range(1,10001):
    if(i not in self_num_list):
       print(i)
        