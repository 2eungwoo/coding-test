croatia = ['c=','c-','dz=','d-','lj','nj','s=','z=']

word = input()

for val in croatia:
    if(val in word):
        word = word.replace(val, '#')
        
print(len(word))