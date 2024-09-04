# 1902 2 10
year,month,date = map(int,input().split())
if str(year - month + date)[-1] == '0':
   print('대박')
else:
    print('그럭저럭')

