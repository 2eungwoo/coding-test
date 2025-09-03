class Solution {
    public int[] solution(int[][] arr) {
        int size = arr.length;
        int[] answer = new int[2]; // [0개수,1개수]
        compress(arr, 0, 0, size, answer);
        return answer;
    }
    
    private static void compress(int[][] arr, int x, int y, int size, int[] answer) {
        if(isAllSame(arr, x, y, size)) {
            if(arr[y][x] == 0) {
                answer[0]++;
            }
            else if(arr[y][x] == 1){
                answer[1]++;    
            }
            return;
        }
        
        int half = size/2;
        compress(arr, x, y, half, answer);
        compress(arr, x+half, y, half, answer);
        compress(arr, x, y+half, half, answer);
        compress(arr, x+half, y+half, half, answer);
        
    }
    
    private static boolean isAllSame(int[][] arr, int x, int y, int size) {
        int num = arr[y][x];
        
        for(int i=y; i<y+size; i++) {
            for(int j=x; j<x+size; j++) {
                if(num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
