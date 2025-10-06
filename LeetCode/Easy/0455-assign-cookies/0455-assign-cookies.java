class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for(int i=0; i<g.length; i++) {
            for(int j=i; j<s.length; j++) {
                if(g[i] <= s[j]) {
                    cnt++;
                    break;
                } else{
                    continue;
                }
            }
        }
        return cnt;
    }
}


// g와 s를 동시 비교하면서
// g[i] <= s[j] 이면 쿠키를 준다. 쿠키가 남아도 된다. 
//만족시키려면 최소 이상만 주면 됨. 만족개수보다 작으면 못줌