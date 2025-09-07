import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Set<String> set = new HashSet<>();

        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set.size());
        
        
    }
    

}
// ababc
// [0],[1],[2],[3],[4]
// [0-1], [1-2], [2-3],[3-4]
// [0-2], [1-3], [2-4]
// [0-3], [1-4]
// [0-4]