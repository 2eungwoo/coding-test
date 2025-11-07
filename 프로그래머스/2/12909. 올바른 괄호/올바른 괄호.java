import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(!stack.isEmpty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        
        if(stack.isEmpty()) {
            return true;
        } else{
            return false;
        }

    }
}
