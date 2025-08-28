import java.util.*;

class Solution {
    private final static int[] dx = {0,-1,0,1};
    private final static int[] dy = {1,0,-1,0};

    public int solution(int[][] maps) {
        
        int height = maps.length;
        int width = maps[0].length;

        boolean[][] visited = new boolean[height][width];
        visited[0][0] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0, 1 }); // y,x,distance

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curY = cur[0];
            int curX = cur[1];
            int curDist = cur[2];

            if(curY == height - 1 && curX == width -1) 
                return curDist;

            for (int dir = 0; dir < 4; dir++) {
                int nx = curX + dx[dir];
                int ny = curY + dy[dir];

                if(nx < 0 || ny < 0 || ny >= height || nx >= width) continue;
                if(visited[ny][nx] || maps[ny][nx] == 0) continue;

                visited[ny][nx] = true;
                q.add(new int[]{ny, nx, curDist + 1});
            }
        }

        return -1;
    }
}