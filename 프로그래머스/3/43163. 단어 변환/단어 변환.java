import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<Word> q = new LinkedList<>();
        q.add(new Word(begin, 0));

        boolean[] visited = new boolean[words.length];

        while (!q.isEmpty()) {
            Word cur = q.poll();

            if (cur.word.equals(target)) {
                return cur.stepCount;
            }

            for (int i = 0; i < words.length; i++) {
                if (visited[i] || !isConvertable(words[i], cur.word))
                    continue;

                visited[i] = true;
                q.add(new Word(words[i], cur.stepCount + 1));
            }
        }

        return 0;

    }
    
    private static boolean isConvertable(String w1, String w2) {
        int count = 0;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    } 
    
    private static class Word {
        private final String word;
        private final int stepCount;

        private Word(String word, int stepCount) {
            this.word = word;
            this.stepCount = stepCount;
        }
    }
}