import java.util.Queue;
import java.util.LinkedList;


class Solution {
    private static int dx[] = {0,1,0,-1};
    private static int dy[] = {1,0,-1,0};

    public int solution(int[][] maps) {
        Queue<State> queue = new LinkedList<>();
        int height = maps.length;
        int width = maps[0].length;

        State init = new State(0, 0, 1);
        queue.offer(init);
        
        boolean[][] visited = new boolean[height][width];
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            State cur = queue.poll();

            if (cur.y == height - 1 && cur.x == width - 1) {
                return cur.distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (ny < 0 || ny >= height || nx < 0 || nx >= width) {
                    continue;
                }
                if (!visited[ny][nx] && maps[ny][nx] == 1) {
                    queue.offer(new State(ny, nx, cur.distance + 1));
                    visited[ny][nx] = true;
                }
            }
        }

        return -1;

    }


    private class State {
        private final int y;
        private final int x;
        private final int distance;

        private State(final int y, final int x, final int distance) {
            this.y = y;
            this.x = x;
            this.distance = distance;
        }
    }
}
/*
    추적해야될 요소: <x,y,distance>
*/