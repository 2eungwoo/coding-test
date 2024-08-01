str = input()

result1 = []
result2 = []
for i in str:
    code1 = chr(ord(i)+2)
    code2 = chr((ord(i)*7)%80+48)
    result1.append(code1)
    result2.append(code2)
    
    
print(''.join(result1))
print(''.join(result2))
    

