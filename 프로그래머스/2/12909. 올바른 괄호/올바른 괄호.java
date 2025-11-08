import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } 
                } else { 
                    return false;
                }
                
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

/*
    ( 가 들어오면 stack.push
    ) 가 들어오면 무시
        ㄴ> )가 들어왔는데 (가 있을 경우 ()가 되므로 stack.pop
        
    
    만약 최초 입력이 ) 부터 시작하면 단순히 무시만하면
    )() 이 경우에 대해서 정상괄호라고 판단하게 되므로 고려해야함
*/