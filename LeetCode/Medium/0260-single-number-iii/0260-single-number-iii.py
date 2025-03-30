class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        
        if(len(nums) == 2):
            return nums

        dic = collections.defaultdict(int)

        for n in nums:
            dic[n] += 1

        answer = []
        for k,v in dic.items():
            if(v == 1):
                answer.append(k)

        return answer
