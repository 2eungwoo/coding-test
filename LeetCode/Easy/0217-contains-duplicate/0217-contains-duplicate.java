// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); // O(nlogn)

//         int len = nums.length; 
//         for(int i=1; i<len; i++) { // O(n)
//             if(nums[i-1] == nums[i]) { 
//                 return true;
//             } 
//         }

//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Map<Integer, Integer> numberMap = new HashMap<>(); // <val, count>
//         for(int n : nums) { // O(n)
//             numberMap.put(n, numberMap.getOrDefault(n,0) + 1);
//         }

//         // O(n)
//         for(int n : numberMap.values()) {
//             if(n > 1) {
//                 return true;
//             }
//         }

//         return false;
        
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {  
        Set<Integer> numberSet = new HashSet<>();

        for(int n : nums) {
            if(!numberSet.add(n)) {
                return true;
            }
        }
        return false;
    }
}