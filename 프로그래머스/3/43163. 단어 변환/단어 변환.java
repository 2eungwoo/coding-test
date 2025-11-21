import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int len = words.length;

        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(begin, 0));

        boolean[] visited = new boolean[len];
        // visited[0] = true; 
        // begin은 words에 없는데 방문처리하니까 첫번째워드가 무조건 방문된상태임.. 

        while(!queue.isEmpty()) {
            State cur = queue.poll();

            if(cur.word.equals(target)) {
                return cur.depth;
            }

            for(int i=0; i<len; i++) {
                if(!visited[i] && convertable(cur.word, words[i])) {
                    queue.offer(new State(words[i], cur.depth + 1));
                    System.out.println("changed word:"+words[i]);
                    visited[i] = true;
                } 
            }
        }

        return 0;

    }

    public boolean convertable(String curWord, String word) {
        int cnt = 0;
        for(int i=0; i<curWord.length(); i++) {
            if(curWord.charAt(i) != word.charAt(i)) { 
                cnt++;
            }
        }

        return cnt == 1;
    }

    public class State {
        private final String word;
        private final int depth;

        public State(final String word, final int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}

/*
    단어가 딱 한 글자 다른거를 찾아서 그걸로 바꾸는 식으로 반복해야함
    hit은 words[] 중에서 hot이랑 한 글자가 다르므로 hit->hot
    hot은 words[] 중에서 got이랑 한 글자가 다르므로 hot->dot
    
    words[] 글자의 첫 번쨰 요소부터 다른지 비교해서 다른게 하나면 그게 convertable임

    
    바꿀 단어를 찾는 과정을 bfs로 완전탐색한다.
    추적해야하는 상태는 cur word와 depth

*/