class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        strs.sort()

        first = strs[0]
        last = strs[-1]
        answer = ""

        for i in range(min(len(first), len(last))):
            if(first[i] == last[i]):
                answer += first[i]
            else:
                break

        return answer

        