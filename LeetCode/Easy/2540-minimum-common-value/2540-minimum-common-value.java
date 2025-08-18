class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;

        int result = findCommon(nums1, nums2);
        min = Math.min(result, min);
        
        return min;
    }

    private int findCommon(int[] nums1, int[] nums2){
        Map<Integer, Integer> maps = new HashMap<>(); // val, idx
        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            maps.put(nums1[i], i);
        }

        for(int i=0; i<nums2.length; i++) {
            if(maps.containsKey(nums2[i])){   
                numbers.add(nums2[i]);
            }
        }

        return numbers.isEmpty() ? -1 : numbers.get(0);
    }
}