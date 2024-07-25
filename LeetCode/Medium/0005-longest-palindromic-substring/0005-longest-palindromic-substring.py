class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        if(len(s) == 1 or s == s[::-1]):
            return s
            
        left, right = 0, len(s)-1

        def expand(left, right):
            while(left >= 0 and right < len(s) and s[left] == s[right]):
                left -= 1
                right += 1
            return s[left+1:right] # s[m:n] 에서 idx:m~n-1 이니까 실수하지 말자


        result = ''
        for i in range(len(s)):
            result = max(result, expand(i,i+1), expand(i,i+2), key=len)

        return result