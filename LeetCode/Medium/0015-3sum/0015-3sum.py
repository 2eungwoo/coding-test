class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        # sorted_numbers = sorted(nums)
        nums.sort()
        # [-4, -1, -1, 0, 1, 2]

        # i,left,right 모두 중복 제외해줘야됨
        for i in range(len(nums) - 2): # 맨오른쪽 두개 요소는 left, right 포인터가 참조할거라서 제외해줘도 됨
            if(i > 0 and nums[i] == nums[i-1]):
                continue

            left, right = i+1, len(nums)-1
            while(left < right):
                sum = nums[i] + nums[left] + nums[right]
                if(sum < 0):
                    left += 1
                elif(sum > 0):
                    right -= 1
                else: # sum == 0
                    result.append([nums[i], nums[left], nums[right]])

                    while(left < right and nums[left] == nums[left+1]):
                        left += 1
                    while(left < right and nums[left] == nums[right - 1]):                    
                        right -= 1
                    # [-1, -,1, -1, 0, 0, 0, 1, 2, 2, 2]
                    # 중복체크를 다 한 다음에 포인터 넘겨야됨
                    left += 1
                    right -= 1

        return result

        # for i in range(len(nums)-2):
        #     if(i > 0 and nums[i] == nums[i-1]):
        #         continue
        #     for j in range(i+1, len(nums)-1):
        #         if(j > i+1 and nums[j] == nums[j-1]):
        #             continue
        #         for k in range(j+1, len(nums)):
        #             if(k > j+1 and nums[k] == nums[k-1]):
        #                 continue
        #             if(nums[i] + nums[j] + nums[k] == 0):
        #                 result.append([nums[i],nums[j],nums[k]])

        # return result

