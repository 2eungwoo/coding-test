import java.util.*;

class Solution {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;

        for (int unit = 1; unit <= s.length(); unit++) {
            int compressed = compress(s, unit);
            min = Math.min(compressed, min);
        }

        return min;
    }

    private int compress(String source, int unit) {
        StringBuilder sb = new StringBuilder();

        String last = "";
        int count = 0;

        for (String token : split(source, unit)) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1)
                    sb.append(count);
                sb.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1)
            sb.append(count);
        sb.append(last);

        return sb.toString().length();
    }

    private List<String> split(String source, int unit) {
        List<String> tokens = new ArrayList<>();

        for (int st = 0; st < source.length(); st += unit) {
            int end = st + unit;
            if (end > source.length())
                end = source.length();
            tokens.add(source.substring(st, end));
        }

        return tokens;
    }
    
   
}




