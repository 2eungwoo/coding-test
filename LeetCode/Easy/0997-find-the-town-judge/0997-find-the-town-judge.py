class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        trust_count = defaultdict(int)     
        trust_others = defaultdict(bool)  

        # for a in range(rows):
        #     for b in range(cols):
        #         trust_count[trust[a][b]] += 1
        #         trust_others[trust[a][0]] = True
        
        for a,b in trust:
            trust_count[b] += 1
            trust_others[a] = True
   
        for i in range(1,n+1):
            if(trust_count[i] == n-1 and not trust_others[i]): # 믿는사람수가 자신 제외 1명(n-1)
                return i

        return -1