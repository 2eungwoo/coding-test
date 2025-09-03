import java.util.*;

class Solution {
    public int[][] solution(int n) {
        List<int[]> routes = new ArrayList<>();
        move(n, 1, 2, 3, routes);
        return routes.toArray(new int[routes.size()][]);
    }

    private static void move(int n, int from, int via, int to, List<int[]> routes) {
        if (n == 1) {
            routes.add(new int[] { from, to });
            return;
        }

        // 1. from -> via
        move(n - 1, from, to, via, routes);
        // 2. from -> to // 가장큰원판(마지막원판)
        move(1, from, via, to, routes);
        // 3. via -> to
        move(n-1, via, from, to, routes);
    }   
}