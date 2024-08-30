class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        used = {}
        start = 0
        max_length = 0

        for idx,char in enumerate(s):
            
            # 이번에 탐색하게 되는 문자가 이전에 한번 나왔던 애 이더라도 무조건 start를 옮겨주면 안됨
            # start를 이미 옮겨준 상태에서는 이전에 등장한 문자가 있더라도 이미 슬라이딩 윈도우 범위 밖이기 때문에 탐색에 포함해야함
            # => start < used[char]
            if(char in used and start <= used[char]): 
                start = used[char] + 1
            else:
                max_length = max(max_length, idx - start + 1)
            
            used[char] = idx

        return max_length
