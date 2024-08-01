class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pair = {
            ')':'(',
            '}':'{',
            ']':'['
        }

        for c in s:
            if c not in pair: # if c is open bracket
                stack.append(c) 
            # elif c is close bracket
            elif not stack or pair[c] != stack.pop():
                return False
                
        if(len(stack) == 0):
            return True
        
    