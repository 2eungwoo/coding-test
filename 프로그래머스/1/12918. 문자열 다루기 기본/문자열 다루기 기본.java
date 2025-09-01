class Solution {
    public boolean solution(String s) {
        int len = s.length();
        
        if((len == 4 || len == 6) && isAllDigit(s)) {
            return true;
        }
        return false;
    }
    
    private static boolean isAllDigit(String s){
        for(Character c : s.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}