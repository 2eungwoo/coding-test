class Solution {
    public boolean isPalindrome(String s) {
        
        String parsed = parseString(s);
        if(parsed.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = parsed.length() - 1;

        while(left < right) {
            if(parsed.charAt(left) == parsed.charAt(right)) {
                left++;
                right--;
            }
            else {
                return false;
            }
        }

        return true;
    }

    private String parseString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();

    }
}