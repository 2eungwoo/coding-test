# money = int(input())
# moneys = [50000,10000,5000,1000,500,100,50,10]
# # 54,520
# cnt = 0
# for c in moneys:
#     cnt += money // c
#     money %= c

# print(cnt)

n=int(input())
lst=list(map(int,input().split()))
t,p = map(int,input().split())
t_bundle=0

for i in lst:
    if i==0:
        continue
    elif i<=t:
        t_bundle+=1
    elif i%t==0:
        t_bundle+=i//t
    else:
        t_bundle+=i//t+1

p_bundle=n//p
pen=n%p

print(t_bundle)
print(p_bundle,pen)