nums = input()

stack = []

for i in nums:
    stack.append(i)
    
for _ in range(len(stack)):
    print(stack.pop(),end="")
