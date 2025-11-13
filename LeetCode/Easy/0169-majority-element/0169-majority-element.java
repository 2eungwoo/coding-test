class Solution {
    public int majorityElement(int[] nums) {
        int middle = (int) (nums.length / 2);
        Arrays.sort(nums);

        return nums[middle];
   }
}

/*
    50000 x 50000 => 2500000000 (25억) => O(N^2) 안됨
*/