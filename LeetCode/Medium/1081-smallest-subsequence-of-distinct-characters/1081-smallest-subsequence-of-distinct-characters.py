class Solution:
    def smallestSubsequence(self, s: str) -> str:
        # 미리 알파벳마다 개수를 세어준다. 
        counts = collections.Counter(s) 
        alphs = []

        for c in s:
            counts[c] -= 1 # 글자 하나 꺼내서 확인할거라 개수 빼주기
            
            if c in alphs: # 이미 처리한 c는 스킵
                continue

            # 이미 있는 알파벳인지 확인하고, 동시에 오름차순에 위배되는애면 팝
            while(alphs and alphs[-1] >= c and counts[alphs[-1]] >= 1):
                alphs.pop()
                
            alphs.append(c)

        return ''.join(alphs)