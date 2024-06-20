index = int(input())
line_num = 1

while(index > line_num):
    index -= line_num
    line_num += 1
    
if(line_num % 2 == 0):
    print(f"{index}/{line_num-index+1}")
else:
    print(f"{line_num-index+1}/{index}")