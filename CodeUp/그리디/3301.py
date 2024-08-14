money = int(input())
moneys = [50000,10000,5000,1000,500,100,50,10]
# 54,520
cnt = 0
for c in moneys:
    cnt += money // c
    money %= c

print(cnt)
