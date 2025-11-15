class Solution {
    private List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate("", n, n);
        return list;
    }

    private void generate(String curComb, int openCount, int closeCount) {
        if(openCount == 0 && closeCount == 0) {
            list.add(curComb);
            return;
        }

        if(openCount > 0) {
            generate(curComb + "(", openCount - 1, closeCount);
        }
        if(openCount < closeCount) {
            generate(curComb + ")", openCount, closeCount - 1);
        }
    }
}


/*
    올바른 괄호 쌍을 모두 만들어서 리턴하는 문제임
    open + close 조합으로 만들거고
    애초에 만들때부터 올바른 쌍으로 만들어서 list에 넣어줄거임

    재귀로 완전탐색 생성해줄거고
    open, close에 해당하는 괄호를 각각 다음상태로 넘겨줄 때가 중요함
    시작이 뭐든, 언제 (를 붙여주고, 언제)를 붙여주냐를 정해줘야함
    이거를 분기해서 두 브랜치로 계속 재귀호출시킬거임
    1. 첨에 open괄호를 넣어주는데 당연히 0보다 커야함. 따라서 0보다 크면 걍 open 넣기
    2. open을 한 번이라도 넣으면 close가 개수가 더 많을꺼임 이 때 close를 넣어줌

    그럼 유효한 모든 괄호 쌍을 만들 수 있음
    1 -> ((( , ))) 이런식으로
    2 -> () () 이런식으로
*/