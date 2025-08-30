import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;
        
        int[] first = new int[len];
        int[] second = new int[len];
        int[] third = new int[len];
        
        fillNumberFirst(len, first);
        fillNumberSecond(len, second);
        fillNumberThird(len, third);
        
        int[] count = new int[3];
        for(int i=0; i<len; i++) {
            if(answers[i] == first[i]) count[0]++;
            if(answers[i] == second[i]) count[1]++;
            if(answers[i] == third[i]) count[2]++;
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) list.add(i + 1);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
        
    }
    
    private static int[] fillNumberFirst(int len, int[] first) {
        int num = 1;
        int idx = 0;
        for(int i=0; i<len; i++){
            first[idx++] = num++;
            if(num == 6) num = 1;
        }

        return first;
    }
    
    private static int[] fillNumberSecond(int len, int[] second) {
        int[] pattern = {2,1,2,3,2,4,2,5}; // 8
        for(int i=0; i<len; i++) {
            second[i] = pattern[i % 8];
        }

        return second;
    }
        
    private static int[] fillNumberThird(int len, int[] third) {
        int[] pattern = {3,3,1,1,2,2,4,4,5,5}; // 10
        for(int i=0; i<len; i++) {
            third[i] = pattern[i % 10];
        }
        return third;
    }
}