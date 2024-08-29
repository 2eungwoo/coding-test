# 1234567 → 1+2+3+4+5+6+7 = 28 → 2 + 8 = 10 → 1 + 0 = 1

# 1234567
str_nums = input()

while(len(str_nums) > 1):
    nums = [int(n) for n in str_nums]
    str_nums = str(sum(nums))
    
print(str_nums)


    
