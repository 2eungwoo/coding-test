import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int len = s.length();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(c == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if(c == ']') {
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if(c == '}') {
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}

/*
    각 괄호 종류에 맞게 닫혀야함
    쭉 봤을 때 다 짝에 맞게 닫히기만 하면 됨
    ([]) 예시에서, ( 로 열고 [로 열고] 로 닫았고 )닫았으니 true
 */