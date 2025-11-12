import java.util.List;
import java.util.ArrayList;

class Solution {
    private static char[] alphabet = {
            'A',
            'E',
            'I',
            'O',
            'U'
    };

    public int solution(String word) {

        List<String> word_list = new ArrayList<>();
        String init = "";
        int depth = 0;
        generate(init, word_list, depth);

        return word_list.indexOf(word) + 1;
    }
    
    private void generate(String curComb, List<String> word_list, int depth) {
        if (!curComb.equals("")) {
            word_list.add(curComb);   
        }

        if (depth == 5) {
            return;
        }

        for (int i = 0; i < alphabet.length; i++) {
            generate(curComb + alphabet[i], word_list, depth+1);
        }
    }
}

/*
    알파벳은 총 26개 근데 재료는 5개
    길이 총 5개 이하
    A ~ UUUUU 까지의 모든 경우의 수는? 5^5
    
    이거를 전부 다 만들어놓은다음
    word가 ㅇㄷ몇번쨰 인덱스에 있냐 혹은 해시맵에 넣고 몇번쨰있냐 찾으면될듯?

    1. 완전탐색으로 전부 만들어야함, 알파벳 사용은 중복허용
       - 재료는 정해져있음 
    
*/

// import java.util.*;

// class Solution {
//     private static final char[] ALPHA = { 'A', 'E', 'I', 'O', 'U' };
//     private static List<String> list = new ArrayList<>();

//     public int solution(String word) {
//         generate("", 0);
//         return list.indexOf(word);
//     }

//     private static void generate(String cur, int depth) {
//         list.add(cur);

//         if (depth == 5) {
//             return;
//         }

//         for(char c : ALPHA) { 
//             generate(cur + c, depth + 1);   
//             /*
//              A 
//                 - A
//                     - A
//                     - E
//                     - I
//                     - O
//                     - U
//                 - E
//                 - I
//                 - O
//                 - U
//              E
//                 - A
//                 - E
//                 - I
//                 - O
//                 - U
//              I
//              O
//              U
//              */
//         }


//     }
// }

// // 현재 단어, depth (워드의 길이) 
// // generate(cur + c, depth + 1);

// // 시간복잡도 분석
// // 단어길이 1 -> 5가지
// // 단어길이 2 -> 5x5 가지
// // 단어길이 5 -> 5x5x5x5x5가지 => 3905가지
// // N번(N=1) 순회하면 최대 O(19525)
// // 1초 기준 1억회니까 충분히 여유로움. 완전탐색이 될 듯

// // start -> word(destination)