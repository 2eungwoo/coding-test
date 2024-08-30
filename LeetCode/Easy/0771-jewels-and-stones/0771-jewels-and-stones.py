class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        # res = collections.defaultdict(int)
        # cnt = 0

        # for c in stones:
        #     res[c] += 1

        # for c in jewels:
        #     cnt += res[c]

        # return cnt

        res = collections.Counter(stones)
        cnt = 0
        
        for c in jewels:
            cnt += res[c]
        return cnt