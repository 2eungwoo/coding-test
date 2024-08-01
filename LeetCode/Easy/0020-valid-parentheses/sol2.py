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
            elif c in pair:
                if stack and stack[-1] == pair[c]:
                    stack.pop()
                else:
                    stack.append(c)

        if(len(stack) == 0):
            return True
        else:
            return False
        
    
