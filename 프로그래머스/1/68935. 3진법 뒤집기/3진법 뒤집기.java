class Solution {
    public int solution(int n) {

        // 10진수 -> 3진수
        String str = Integer.toString(n,3);
        
        // 뒤집기
        String sb = new StringBuilder(str).reverse().toString();
    
        return Integer.valueOf(sb,3);
        
    }
}