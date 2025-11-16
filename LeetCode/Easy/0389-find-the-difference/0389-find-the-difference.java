class Solution {
    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // 길이만큼 쭉 찾아서 다른 시점에 다른걸 리턴
        // 이렇게하면 a,b 길이가 동일한 지점까지만 비교가 됨
        // 더 긴 쪽이 있다면, 그 마지막 요소를 따로 리턴해야됨 -> 더 긴거는 추가됐다는거니까
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return b[i];
            }
        }

        return b[b.length - 1];
    }
}