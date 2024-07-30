str = input()

left, right = 0, 2
mid = 1
joi = 0
ioi = 0

while(right < len(str)):
  if(str[left] == "J" and str[mid] == "O" and str[right] == "I"):
    joi += 1
    left += 1
    mid += 1
    right += 1
  elif(str[left] == "I" and str[mid] == "O" and str[right] == "I"):
    ioi += 1
    left += 1
    mid += 1
    right += 1
  else:
    left += 1
    mid += 1
    right += 1

print(joi)
print(ioi)
  

