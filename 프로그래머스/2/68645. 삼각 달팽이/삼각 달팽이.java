class Solution {

    private final int[] dx = {0, 1, -1};
    private final int[] dy = {1, 0, -1};

    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        fillNumber(triangle, n);
        return convertToFlat(triangle, n);

    }

    private void fillNumber(int[][] triangle, int n) {
        int val = 1;
        int curX = 0;
        int curY = 0;
        int dir = 0;

        while (true) {
            triangle[curY][curX] = val++;

            int nx = curX + dx[dir];
            int ny = curY + dy[dir];
            if (isBlocked(nx, ny, n, triangle)) {
                dir = (dir + 1) % 3;
                nx = curX + dx[dir];
                ny = curY + dy[dir];
                if (isBlocked(nx, ny, n, triangle))
                    break;
            }

            curX = nx;
            curY = ny;
        }
    }

    private boolean isBlocked(int nx, int ny, int n, int[][] triangle) {
        return nx < 0 || ny < 0 || nx >= n || ny >= n || triangle[ny][nx] != 0;
    }

    private int[] convertToFlat(int[][] triangle, int n) {
        int idx = 0;
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[idx++] = triangle[i][j];
            }
        }
        return result;
    }
}

/* 

1
2 9
3 10 8
4 5 6 7

*/

/*
 숫자채우기 
 - 하 -> 우 -> 좌상 -> 하 -> 우 -> ... 
 - dx, dy
 */