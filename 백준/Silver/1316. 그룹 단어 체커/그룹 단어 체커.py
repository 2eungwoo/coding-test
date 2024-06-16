# 한번 나온애가, 바로 다음거랑 다른데, 그 이후에 또 나오면 그룹단어가 아니다

n = int(input())
cnt = n
no_group = 0

for _ in range(n):
    word = input()
    is_group = True
    for i in range(len(word)-1):
        if(word[i] != word[i+1]):
            if(word[i] in word[i+2:]):
                is_group = False
                break
    if(is_group == False):
        no_group += 1        
            
        
print(cnt - no_group)
