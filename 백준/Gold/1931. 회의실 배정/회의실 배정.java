import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[][] time = new int[n][2]; // start, end
    for(int i=0; i<n; i++) {
        time[i][0] = sc.nextInt(); // start
        time[i][1] = sc.nextInt(); // end
    }
    
    Arrays.sort(time, (a,b) -> {
        if(a[1] == b[1]) {
            return a[0] - b[0]; // end가 같으면 start기준
        }
        return a[1] - b[1];
    });
    
    int count = 0;
    int end = 0; // 첫비교시 0
    for(int i=0; i<n; i++) {
        if(time[i][0] >= end) {
            count++;
            end = time[i][1];
        }
    }
    
    System.out.println(count);
  }
}
