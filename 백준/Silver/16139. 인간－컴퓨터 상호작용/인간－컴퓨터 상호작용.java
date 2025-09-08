import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int n = s.length();
        int[][] prefix = new int[n+1][26];

        for(int i=1; i<=n; i++) {
            int ch = s.charAt(i - 1) - 'a';
            for(int j=0; j<26; j++) {
                prefix[i][j] = prefix[i-1][j];
            }
            prefix[i][ch]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int idx = c - 'a';
            int answer = prefix[r+1][idx] - prefix[l][idx];
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}

