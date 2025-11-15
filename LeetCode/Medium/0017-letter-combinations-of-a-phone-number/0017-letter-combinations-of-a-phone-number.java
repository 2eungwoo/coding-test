class Solution {
    private static final Map<Character, String> numpad = Map.of(
        '2',"abc",
        '3',"def",
        '4',"ghi",
        '5',"jkl",
        '6',"mno",
        '7',"pqrs",
        '8',"tuv",
        '9',"wxyz"
    );

    private List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        generate(new State(0,""), digits);
        return list;
    }

    private void generate(State cur, String digits) {
        if(cur.idx == digits.length()) {
            list.add(cur.comb);
            return;
        }

        char num = digits.charAt(cur.idx);
        String candidates = numpad.get(num);

        for(char c : candidates.toCharArray()) {
            generate(new State(cur.idx + 1, cur.comb + c), digits);
        }
    }

    private class State {
        private final int idx;
        private final String comb;

        private State(final int idx, final String comb) {
            this.idx = idx;
            this.comb = comb;
        }
    }
}

/*
    digits[i] 에 해당하는 번호에 대응하는 문자열 끼리 요소로
    만들 수 있는 모든 조합을 구하면 됨
    재귀로 할거고,
    numpad를 map형태로 만들었으니
    digits[i]가 key가 되는거임
    따라서 candidates[i] = numpad[digits[i]]

*/