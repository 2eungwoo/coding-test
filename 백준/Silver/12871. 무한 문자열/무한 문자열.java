import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        int l = lcm(s.length(), t.length());

        StringBuilder sbS = new StringBuilder();
        for (int i = 0; i < l / s.length(); i++)
            sbS.append(s);

        StringBuilder sbT = new StringBuilder();
        for (int i = 0; i < l / t.length(); i++)
            sbT.append(t);

        System.out.println(sbS.toString().equals(sbT.toString()) ? 1 : 0);
    }
    
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    

}