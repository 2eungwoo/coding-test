class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);

        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            int cur = maps.get(s.charAt(i));
            if(i + 1 < s.length() && cur <  maps.get(s.charAt(i+1))){
                sum -= cur;
            }
            else{
                sum += cur;
            }
        }

        return sum;
    }
}