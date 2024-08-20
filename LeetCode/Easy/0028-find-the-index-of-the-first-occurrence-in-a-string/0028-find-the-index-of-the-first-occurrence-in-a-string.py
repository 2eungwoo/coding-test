class Solution:
    def strStr(self, haystack: str, needle: str) -> int:

        if(not needle):
            return 0

        needle_len = len(needle)

        # 건너뛰어버리면 문자열 하나하나 스캔 못함 예외케이스 존재
        # for i in range(0,len(haystack),needle_len):
        #     if(haystack[i:i+needle_len] == needle):
        #         return i

        for i in range(0,len(haystack)):
            if(haystack[i:i+needle_len] == needle):
                return i

        return -1
        