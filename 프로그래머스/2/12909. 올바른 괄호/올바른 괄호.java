import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        // 스택이 비어있으면 푸쉬
        //   ㄴ '(' 다? 푸쉬
        //   ㄴ ')' 다? 무시
        // 스택에 뭔가 있다 그러면 확인
        //   ㄴ '('가 있다? 다음에 오는게 )이면 (를 팝
        
        for(Character c : s.toCharArray()) {
            if(stack.isEmpty()) {
                if(c == '(') {
                    stack.push(c);
                } else {
                    // continue;
                    return false;
                }
            } else {
                if(stack.peek() == '(') {
                    if(c == '(') {
                        stack.push(c);
                    } else{
                        stack.pop();
                    }
                }
            }
        }
        
        // 다 돌았는데 stack이 비어있다? 올바른 괄호
        // 뭔가 남았다? 쌍이 안맞는거임
        return stack.isEmpty();
    }
}

// 가운데가 어떻게 되든
// '(' 로 시작하고 ')'로 끝나면 되는게 아니라
// 무조건 하나의 '(' 에는 하나의 ')'가 대응되어야함
