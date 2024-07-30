class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        pair = []
        sum = 0

        for n in nums: # [1,2,3,4,5,6]
            pair.append(n)

            if(len(pair) == 2):
                sum += min(pair)
                pair = []

        return sum

