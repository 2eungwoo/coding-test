class Solution:
    def removeDuplicateLetters(self, s: str) -> str:

        # 미리 알파벳마다 개수를 세어준다. 
        counts = collections.Counter(s) 
        alphs = []

        for c in s:
            counts[c] -= 1 # 글자 하나 꺼내서 확인할거라 개수 빼주기
            
            if c in alphs: # 이미 처리한 c는 스킵
                continue

            while(alphs and alphs[-1] >= c and counts[alphs[-1]] >= 1):
                alphs.pop()

            alphs.append(c)

        return ''.join(alphs)

 

        