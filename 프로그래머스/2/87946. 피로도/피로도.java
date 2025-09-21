import java.util.List;
import java.util.ArrayList;

class Solution {
    
    // k : 현재피로도
    // dungeons[i][0] : 최소 요구 필요도
    // dungeons[i][1] : 소모 필요도
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        State init = new State(k, 0, dungeons.length);
        return clearDungeons(init, dungeons, visited);
    }

    private int clearDungeons(State state, int[][] dungeons, boolean[] visited) {
        // 현재 상태
        // 던전 다 돌았으면 탈출
        if (state.leftDungeons == 0) {
            return state.cleared;
        }

        int maxCleared = state.cleared;

        // 다음 상태
        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0];
            int cost = dungeons[i][1];

            if (!visited[i] && state.curFatigue >= need) {
                visited[i] = true;
                State nextState = new State(state.curFatigue - cost, state.cleared + 1, state.leftDungeons - 1);
                maxCleared = Math.max(maxCleared, clearDungeons(nextState, dungeons, visited));
                visited[i] = false;
            }
        }
        return maxCleared;
    
    }

    private class State {
        private final int curFatigue;
        private final int cleared;
        private final int leftDungeons;

        public State(int curFatigue, int cleared, int leftDungeons) {
            this.curFatigue = curFatigue;
            this.cleared = cleared;
            this.leftDungeons = leftDungeons;
        }
    }
}


// 현재 피로도, 남은 던전 수, 남은 피로도 상태 추적이 필요함

// 위 상태를 전이하면서 재귀탐색으로 모든 경우를 탐색하고
// 던전 클리어 카운트를 세어서
// 그 중 max를 리턴한다.

// 남은 피로도는 탐색 조건에 넣을 수 있으니 필요없음
// 남은 던전 수를 사용해서 재귀탈출조건도 다음상태전이에 따라서
// 암묵적으로 탈출조건에 걸리니 굳이 필요없나?