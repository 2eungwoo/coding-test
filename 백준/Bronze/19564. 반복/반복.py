# 알파벳 순 따져봤을 때
# i번째 문자가 i + k 번째보다 뒷 순이면
# abcdefghijklmnopqrstuvwxyz 입력 한번 더 해야하니까 카운트 +1

# 예를들어 abcd는 abcdefghijklmnopqrstuvwxyz 한번이면 구할 수 있지만
# bcda 는 abcdefghijklmnopqrstuvwxyz를 두번 써야함. 그니까 str[0]:b 가 str[1]:c 보다 inputs에서의 인덱스가 작아야함
# str[i]의 abcdefghijklmnopqrstuvwxyz 에서의 인덱스 ==> abcdefghijklmnopqrstuvwxyz.index(str[i])
#   if(): 이게 많을 수록 k가 줄어들 수 있다는 뜻

str = input()
inputs = "abcdefghijklmnopqrstuvwxyz"

cnt = 1
for i in range(len(str) - 1):
  if(inputs.index(str[i]) < inputs.index(str[i+1])):
    continue
  else:
    cnt += 1

print(cnt)
