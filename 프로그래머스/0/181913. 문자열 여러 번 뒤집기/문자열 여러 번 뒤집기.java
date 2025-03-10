class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for(int[] query : queries) {
            int st = query[0];
            int en = query[1];
            
            while(st < en) {
                char tmp = arr[st];
                arr[st] = arr[en];
                arr[en] = tmp;
                
                st++;
                en--;
            }
        }
        
        return new String(arr); 
    }
}