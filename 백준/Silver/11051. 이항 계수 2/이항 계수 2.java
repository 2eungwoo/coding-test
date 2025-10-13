// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] d = new int[n+1][n+1];
        for(int i=0; i<n+1; i++) {
            d[i][0] = 1;
            d[i][1] = 1;
            d[i][i] = 1;
        }
        
        for(int i=2; i<n+1; i++) {
            for(int j=1; j<i; j++) {
                d[i][j] = d[i-1][j] + d[i-1][j-1];
                d[i][j] %= 10007;
            }
        }
        System.out.println(d[n][k]);
    }
}


// d[i][j] = d[i-1][j] + d[i-1][j-1]