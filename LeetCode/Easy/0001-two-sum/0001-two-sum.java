class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // (val,idx)
        int[][] sortedArr = sortNumsAndIdx(nums);
        return findIdx(sortedArr, target);
    }

    // arr => (val,idx)
    private int[][] sortNumsAndIdx(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2]; 

        for(int i=0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        return arr;
    }

    private int[] findIdx(int[][] sortedArr, int target){
        int left = 0;
        int right = sortedArr.length - 1;
        int sum = 0;

        while(left < right) {
            sum = sortedArr[left][0] + sortedArr[right][0];
            if(sum == target) {
                return new int[]{sortedArr[left][1], sortedArr[right][1]};
            }
            else if(sum < target){
                left += 1;
            }
            else {
                right -= 1;
            } 
        }

        return new int[]{-1, -1};
    }   
}