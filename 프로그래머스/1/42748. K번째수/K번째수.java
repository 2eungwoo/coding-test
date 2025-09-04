import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int len = commands.length;
        int[] answer = new int[len];

        int idx = 0;
        for(int i=0; i<commands.length; i++) {
            int result = findNumber(array, commands[i][0], commands[i][1], commands[i][2]);
            answer[idx++] = result;
        }

        return answer;
    }

    private static int findNumber(int[] array, int i, int j, int k) {
        
        if (i == j) {
            return array[i - 1];
        }
        
        int[] nums = new int[j - i + 1];

        int idx = 0;
        for (int x = i - 1; x < j; x++) {
            nums[idx++] = array[x];
        }

        Arrays.sort(nums);
        
        return nums[k-1];
    }
    
    
}