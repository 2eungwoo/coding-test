class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        
        int[] result = new int[number.length()];
        int idx = 0;
        for(int i=number.length()-1; i>=0; i--) {
            result[idx++] = number.charAt(i) - '0';
        }
        
        return result;
    }
}