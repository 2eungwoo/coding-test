import java.util.*;

class Solution {
    private static final char[] ALPHA = { 'A', 'E', 'I', 'O', 'U' };
    private static List<String> list = new ArrayList<>();

    public int solution(String word) {
        generate("", 0);
        return list.indexOf(word);
    }

    private static void generate(String cur, int depth) {
        list.add(cur);

        if (depth == 5) {
            return;
        }

        for(char c : ALPHA) { 
            generate(cur + c, depth + 1);   
            /*
             A 
                - A
                    - A
                    - E
                    - I
                    - O
                    - U
                - E
                - I
                - O
                - U
             E
                - A
                - E
                - I
                - O
                - U
             I
             O
             U
             */
        }


    }
}

// 현재 단어, depth (워드의 길이) 
// generate(cur + c, depth + 1);

// 시간복잡도 분석
// 단어길이 1 -> 5가지
// 단어길이 2 -> 5x5 가지
// 단어길이 5 -> 5x5x5x5x5가지 => 3905가지
// N번(N=1) 순회하면 최대 O(19525)
// 1초 기준 1억회니까 충분히 여유로움. 완전탐색이 될 듯

// start -> word(destination)