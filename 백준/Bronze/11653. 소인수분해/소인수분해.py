n = int(input())

if(n == 1):
  print("")

while(n>1):
  for val in range(2,n+1):
    if(n % val == 0):
      print(val)
      n = n // val
      break
      