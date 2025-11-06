import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == arr[i]) {
                    continue;
                }
            }
            stack.push(arr[i]);
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}

// 중복 삭제하되 순서를 유지하면서 남겨야됨 -> set은 못씀
// 순서를 유지하기위해 arr 차례대로 순회하면서 중복 나오면 skip하는 방식으로
// arr을 stack에 그대로 쌓으면서 중복 나오면 skip

// [4,4,4,3,3]