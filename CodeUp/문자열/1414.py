str = input().lower()

result1 = 0
for c in str:
    if c == 'c':
        result1 += 1
        
print(result1)

result2 = 0
for i in range(len(str)-1):
    if(str[i] == 'c' and str[i+1] == 'c'):
        result2 += 1
        
print(result2)
