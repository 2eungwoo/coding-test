class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // 시간 O(nlogn), 공간 O(1)
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]) return true;
        // }
        // return false;

        // 시간 O(n), 공간 O(n)
        Set<Integer> seen = new HashSet<>();
        for(int n : nums) {
            if(!seen.add(n)) return true;
        }
        return false;
    }
}