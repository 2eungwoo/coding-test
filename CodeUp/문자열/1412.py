import re
import collections

str = input()

words = re.sub(r'[^\w]','',str).lower()
dic = collections.defaultdict(int)

for i in words:
    dic[i] += 1
        
alphabets = "abcdefghijklmnopqrstuvwxyz"       
for i in alphabets:
    print(f"{i}:{dic[i]}")
    
