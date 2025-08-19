import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int result = Math.min(reverseZero(arr), reverseOne(arr));
        System.out.print(result);
    }

    private static int reverseZero(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0' && (i == 0 || arr[i - 1] != '0')) {
                count++;
            }
        }
        return count;
    }

    private static int reverseOne(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1' && (i == 0 || arr[i - 1] != '1')) {
                count++;
            }
        }
        return count;
    }
}