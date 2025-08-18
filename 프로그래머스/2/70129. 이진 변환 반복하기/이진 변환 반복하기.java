class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int zeros = 0;
        int removed = 0;

        while (!s.equals("1")) {
            zeros = countZeros(s);
            loop++;
            removed += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }
        
        return new int[] { loop, removed };
    }
    
    private int countZeros(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '0')
                count++;
        }

        return count;
    }

}