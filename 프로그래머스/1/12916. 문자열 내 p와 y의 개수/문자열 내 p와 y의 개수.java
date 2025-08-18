class Solution {
    boolean solution(String s) {
        
        int pCount = 0;
        int yCount = 0;
        
        for(char c : s.toCharArray()) {
            // if(c == 'p'){
            //     pCount++;
            // }else if(c == 'y') {
            //     yCount++;
            // }
            switch(c) {
                    case 'p', 'P' -> pCount++;
                    case 'y', 'Y' -> yCount++;
            }
        }
        
        return pCount == yCount;
    
    }
}
