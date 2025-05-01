class Solution:
    def clearDigits(self, s: str) -> str:
        stack = []
        # nums = ["1","2","3","4","5","6","7","8","9","0"]
        
        for ch in s:
            stack.append(ch)
            # if(ch in nums):
            if(ch.isdigit()):
                stack.pop()
                stack.pop()

        return ''.join(stack)
    

