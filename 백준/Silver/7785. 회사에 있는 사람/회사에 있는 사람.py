n = int(input())
dic = {}

for _ in range(n):
    name, status = map(str, input().split())
    if(status == 'enter'):
        dic[name] = 'enter'
    else:
        del dic[name]
        
reverse_name = sorted(dic, reverse=True)
for result in reverse_name:
    print(result)