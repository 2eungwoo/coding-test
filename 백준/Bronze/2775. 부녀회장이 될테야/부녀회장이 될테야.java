// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(solve(k,n));
        }
    }
    
    private static int solve(int k, int n) {
            int[][] d = new int[k+1][n+1]; // k층n호
            
            for(int i=0; i<=n;i++){
                d[0][i] = i;
            }
            
            for(int i=1; i<=k; i++) {
                for(int j=1; j<=n; j++) {
                    d[i][j] = d[i-1][j] + d[i][j-1];
                }
            }
            return d[k][n];
        }
}


// a층 b호 d[a][b]
// d[a][b]는 a-1층 1호~b호 다 합쳐야됨
// d[a][b] = d[a-1][1]+d[a-1][2]+..+d[a-1][b]
// a층b호 사는 사람 수는 한층아래/자기호수 까지 사람들의 합
// 자기호수인데 한층 아래를 a[a-1][b]라고하면
// a[a-1][b] 입장에서도 자기랑같은호수(b)에다가 한층 아래부터 1호까지 합
// 의 반복
// 따라서 자기 한층 바로아래 인원수랑
// 그 집 기준 왼쪽으로 쭉(0호까지) 의 합
// 바로 옆집인 d[a-1][b-1]는 d[a][b-1]의 바로 아랫집임 이게 또 각자 반복
// d[a][b] = d[a-1][b] + d[a][b-1]