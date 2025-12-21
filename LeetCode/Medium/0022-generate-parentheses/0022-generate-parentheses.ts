function generateParenthesis(n: number): string[] {
    const result: string[] = [];

    function generate(curComb: string, openCount: number, closeCount: number) : void {

        // if(curComb !== "") {
        //     result.push(curComb);
        // }
        // 모든 조합을 넣는게 아니라 
        // 올바른 괄호쌍만 넣어줄거니까 
        // open/close 둘 다 잘 소모했을 떄만 push

        if(openCount == 0 && closeCount == 0) {
            result.push(curComb);
            return;
        }

        if(openCount > 0) {
            generate(curComb + "(", openCount - 1, closeCount);
        }

        if(openCount < closeCount) {
            generate(curComb + ")", openCount, closeCount - 1);
        }
    }

    generate("", n, n);
    return result;
}
/*
    쌍 개수가 주어졌을 때
    가능한 모든 괄호쌍을 만들기

    만들 수 있는 모든걸 다 만든다음
    올바른 괄호쌍이면 add하면 될듯
    => 경우의 수는 2^n만큼

    -> 근데 이러면 뭔가 불필요한 작업인거같음 코드도 너무 길어질듯
    애초에 올바른 괄호쌍만 만들어서 add하면 됨
    괄호쌍 총 개수가 n이면 open, close 개수도 모두 n이고
    open이 한 번 쓰였을 때 close가 쓰이면 됨

    완전탐색으로 만들 때 재귀로 open을 넣는 경우 close를 넣는 경우
    두 가지로 분기해서 open,close 개수를 조건으로 추적해줌
*/