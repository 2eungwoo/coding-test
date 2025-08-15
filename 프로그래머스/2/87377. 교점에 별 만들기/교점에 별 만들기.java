import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> points = getAllIntersections(line);

        Point min = getMinPoint(points);
        Point max = getMaxPoint(points);

        char[][] board = makeBoard(points, min, max);

        return convertBoardToStringArray(board);
    }

    private List<Point> getAllIntersections(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = getIntersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]
                );
                if (intersection == null) {
                    continue;
                }
                points.add(intersection);
            }
        }
        return points;
    }

    // 좌표 교점 구하기
    private Point getIntersection(long a1, long b1, long c1, 
                                  long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0)
            return null;

        return new Point((long) x, (long) y);
    }
    
     // 최소 좌표
    private Point getMinPoint(List<Point> points) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (Point p : points) {
            minX = Math.min(minX, p.x);
            minY = Math.min(minY, p.y);
        }
        return new Point(minX, minY);
    }

    // 최대 좌표
    private Point getMaxPoint(List<Point> points) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        for (Point p : points) {
            maxX = Math.max(maxX, p.x);
            maxY = Math.max(maxY, p.y);
        }
        return new Point(maxX, maxY);
    }

    // 보드 생성, 좌표 변환 -> 별 찍기
    private char[][] makeBoard(List<Point> points, Point min, Point max) {
        int width = (int) (max.x - min.x + 1);
        int height = (int) (max.y - min.y + 1);

        char[][] board = new char[height][width];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        // 좌표 변환 (데카르트 좌표계 -> 2차원 배열 좌표계)
        for (Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            board[y][x] = '*';
        }
        return board;
    }

    // char[][] → String[]
    private String[] convertBoardToStringArray(char[][] board) {
        String[] result = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = new String(board[i]);
        }
        return result;
    }

    private static class Point {
        public final long x;
        public final long y;
        
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}