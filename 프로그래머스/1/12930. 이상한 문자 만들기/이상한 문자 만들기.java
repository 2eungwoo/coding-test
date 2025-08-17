class Solution {
    public String solution(String s) {
        
        StringBuilder str = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' '){
                str.append(' ');
                idx = 0;
            }
            else {
                if(idx % 2 == 0) {
                    str.append(Character.toUpperCase(c));
                }
                else {
                    str.append(Character.toLowerCase(c));
                }
                idx += 1;
            }
        }
     return str.toString();   
    }
}