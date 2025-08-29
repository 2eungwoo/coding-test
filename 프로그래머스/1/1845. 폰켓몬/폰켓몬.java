import java.util.*;

class Solution {
    public int solution(int[] nums) {
    
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        
        int max = set.size();
        
        if(max >= (nums.length)/2) {
            return nums.length/2;
        }else{
            return max;
        }
    }
}