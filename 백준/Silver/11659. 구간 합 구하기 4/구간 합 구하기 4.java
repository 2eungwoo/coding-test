// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] prefixSum = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            prefixSum[i] += sum;
        }
        
        for(int i=0; i<m; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            solution(from,to,prefixSum);
        }
    }
    
    private static void solution(int from, int to, int[] prefixSum){
        
        int answer = 0;
        if(from > 0) {
            answer = prefixSum[to] - prefixSum[from-1];    
        } else {
            answer = prefixSum[to];
        }
        
        System.out.println(answer);
    }
}

/*
    배열 A   : 5 4 3 2 1
    누적합 S : 5 9 12 14 15
    S(from~to) = S(to) - S(from-1)

*/

