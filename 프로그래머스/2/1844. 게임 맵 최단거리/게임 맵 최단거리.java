import java.util.*;

class Solution {
    private final static int[] dx = {0,-1,0,1};
    private final static int[] dy = {1,0,-1,0};

    public int solution(int[][] maps) {
        Queue<State> q = new LinkedList<>();
        
        int width = maps[0].length;
        int height = maps.length;

        boolean[][] visited = new boolean[height][width];
        
        visited[0][0] = true;
        q.add(new State(0,0,1));

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.y == height - 1 && cur.x == width - 1) {
                return cur.dist;
            }

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if (ny < 0 || nx < 0 || ny >= height || nx >= width)
                    continue;
                if (visited[ny][nx] || maps[ny][nx] == 0)
                    continue;

                visited[ny][nx] = true;
                q.add(new State(ny, nx, cur.dist + 1));
            }
        }
        return -1;

    }

    private static class State {
        private final int y;
        private final int x;
        private final int dist;

        State(int y, int x, int dist) {
            this.y = y;
            this.x = x;
            this.dist = dist;
        }
    }
}