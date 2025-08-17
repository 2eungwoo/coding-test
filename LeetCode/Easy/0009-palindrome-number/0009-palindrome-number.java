class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;
        
        int len = (int)Math.log10(x) + 1;
        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            arr[i] = x % 10;
            x /= 10;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if(arr[left] == arr[right]) {
                left += 1;
                right -= 1;
            }
            else {
                return false;
            }
        }
        return true;
    }
}