import java.util.List;
import java.util.ArrayList;

class Solution {
    private static List<String> dictionary = new ArrayList<>();
    private static char[] ALPHABET = {
        'A','E','I','O','U'
    };

    public int solution(String word) {
        
        String init = "";
        generate(init, ALPHABET);

        return dictionary.indexOf(word) + 1;
    }

    private void generate(String cur, char[] ALPHABET) {
        if (cur.length() == 6) {
            return;
        }

        if (!cur.equals("")) {
            dictionary.add(cur);
        }
        
        for (int i = 0; i < 5; i++) {
            generate(cur + ALPHABET[i], ALPHABET);
        }
    }
}
/*
    단어를 쭉 만들어보고, 
    word가 그 단어 리스트에 몇 번째 있느냐 구함

    경우의 수 : 5^5 => 3125 

    A부터 시작해서 U까지 순차적으로 조합해서 만들어서
    사전순으로 정렬된 리스트를 만들어야함
*/