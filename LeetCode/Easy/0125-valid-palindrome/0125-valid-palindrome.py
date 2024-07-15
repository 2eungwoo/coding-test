class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs = []
        for c in s:
            if(c.isalnum()):
                strs.append(c.lower())

        for i in range(len(strs)):
            if(strs[i] == strs[-i-1]):
                continue
            else:
                return False
                exit(0)

        return True
        
        