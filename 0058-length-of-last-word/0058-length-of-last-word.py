class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        stlist = s.rstrip().split(' ')
        return len(stlist[-1])