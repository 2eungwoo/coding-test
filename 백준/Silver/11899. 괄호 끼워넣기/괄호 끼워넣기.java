
import java.util.Stack;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        
        Stack<Character> stack = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(!stack.isEmpty() && c == '(' && stack.peek() == ')') {
                stack.pop();
            } else { // emtpy || not pair
                stack.push(c);
            }
        }
    
        System.out.println(stack.size());
    
    }
}
/*

    뒤에서부터 스캔해서
    올바른 괄호쌍을 다 제거하고
    마지막에 쌍을 못이룬 괄호만 냅두면
    최소로 가져갈 수 있음
*/

/*
    기본적으로 push는 하고
    괄호가 들어왔을때 탑이랑 str[i]랑 쌍이 맞으면 push안하고 pop
    뒤에서부터보든 앞에서부터보든 -짝맞으면 팝, 아니면푸쉬- 만 잘 하면 됨
    
*/