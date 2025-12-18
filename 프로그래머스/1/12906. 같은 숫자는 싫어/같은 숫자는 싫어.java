// stack
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int n : arr) {
            if(!stack.isEmpty() && stack.peek() == n) {
                continue;
            } 
            stack.push(n);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}

// 직전 중복만 보면 되므로
// 가장 최신 상태만 가지고 있는 스택 성질을 사용
// arr 쭉 보면서 push하는데 stack.peek랑 비교해서 분기하면 됨
// peek랑 arr[i]랑 같으면 skip

// non-stack
// import java.util.List;
// import java.util.ArrayList;

// public class Solution {
//     public int[] solution(int[] arr) {
//          List<Integer> result = new ArrayList<>();

//         int prev = -1; // 걍 arr에 없는 아무 값
//         for(int n : arr) {
//             if(n != prev) {
//                 result.add(n);
//                 prev = n;
//             }
//         }

//         return result.stream().mapToInt(i -> i).toArray();
//     }
// }

