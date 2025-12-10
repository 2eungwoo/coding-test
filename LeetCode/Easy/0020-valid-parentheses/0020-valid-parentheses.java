import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
            ')','(',
            ']','[',
            '}','{'
        );

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) { // when close
                if(stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
            else { // when open
                stack.push(c);
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