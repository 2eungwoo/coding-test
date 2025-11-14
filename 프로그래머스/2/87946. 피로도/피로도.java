class Solution {
    private static int max = Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {

        boolean[] cleared = new boolean[dungeons.length];
        State init = new State(0, k);
        clearDungeons(init, dungeons, cleared);

        return max;

    }
    
    private void clearDungeons(State cur, int[][] dungeons, boolean[] cleared) {

        max = Math.max(max, cur.depth);

        if (cur.depth == dungeons.length) {
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!cleared[i] && cur.piro >= dungeons[i][0]) {
                cleared[i] = true;
                clearDungeons(new State(cur.depth + 1, cur.piro - dungeons[i][1]), dungeons, cleared);
                cleared[i] = false;
            }
        }
    }

    public class State {
        private final int depth; // clearCount
        private final int piro;

        public State(final int depth, final int piro) {
            this.depth = depth;
            this.piro = piro;
        }
    }
}

/*
    dungeons : <필요피로도,소모피로도>

    던전 배열을 다 직접 돌아보면서 cnt를 하고
    cnt가 max인 경우를 찾아줘야함

    던전 n개가 있으면 다 도는 경우의 수는 n!
    n<=8이니까 다 돌아봐도 충분함

    a,b,c 가 있으면
    첫선택 3(a,b,c) -> 2(첫선택에서뺀거중남은거) -> 1(두번쨰에서선택뺸거중남은거)
    n!임
*/

/*
    추적해야되는건
    cnt를 계속 알아하고
    어떤 던전을 방문했는지 여부를 알아야함
    현재 어디까지 왔는지도 알아야함
*/