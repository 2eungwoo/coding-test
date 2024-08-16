class Solution:
    def isPalindrome(self, x: int) -> bool:
        str_num = str(x)
        
        if(str_num[::-1] == str_num[0:]):
            return True
        else:
            return False
            
        if(x < 0):
            return False