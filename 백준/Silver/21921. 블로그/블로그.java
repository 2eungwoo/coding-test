import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<x; i++) {
            sum += nums[i];
        }

        int max = sum;
        int count = 1;

        for(int i=x; i<n; i++) {
            sum = sum - nums[i-x] + nums[i];
            if(sum > max) {
                max = sum;
                count = 1;
            }else if (max == sum) {
                count++;
            }
        }

        if(max == 0) {
            System.out.println("SAD");
        }else{
            System.out.println(max);
            System.out.println(count);
        }
        
            
    }
}

// n=5 x=2
// 1 4 2 5 1
// sum[0-2] = n[0] + n[1] + n[2]
// sum[1-3] = n[1] + n[2] + n[3] == sum[0-2] - n[1] + n[3]