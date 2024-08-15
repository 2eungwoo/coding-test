# 800
# 700
# 900
# 198
# 330

pasta = [0] * 3
juice = [0] * 2
res = [0] * 5
p = 0

for i in range(len(pasta)):
    pasta[i] = int(input())
    
for i in range(len(juice)):
    juice[i] = int(input())

min_pasta = min(pasta)
min_juice = min(juice)
        
print((min_pasta + min_juice) + (min_pasta + min_juice) * 0.1)
