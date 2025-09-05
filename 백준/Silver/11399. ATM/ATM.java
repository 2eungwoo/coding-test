import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] people = new int[n];
        for(int i=0; i<n; i++) {
            people[i] = sc.nextInt();
        }
        Arrays.sort(people);
        
        int[] denseSum = new int[n+1];
        denseSum[0] = people[0];
            
        for(int i=1; i<n; i++) {
            denseSum[i] = denseSum[i-1] + people[i];
        }

        int answer = 0;
        for(int d : denseSum) {
            answer += d;
        }
        System.out.println(answer);
    }
}

// P1 = 3, P2 = 1, P3 = 4, P4 = 3, P5 = 2
// 1 2 3 3 4
// 1 3 6 9 13

// Sn = Sn-1 + An
