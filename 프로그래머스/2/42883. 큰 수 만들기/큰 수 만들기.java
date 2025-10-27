import java.util.*;

class Solution {
    public String solution(String number, int k) {

        Stack<Character> stack = new Stack<>();
        for (char num : number.toCharArray()) {
            while (!stack.isEmpty()) {
                if (k > 0 && stack.peek() < num) { // k가 아직 남았고 이전값이 현재값보다 작으면 버림
                    stack.pop();
                    k--;
                }
                else {
                    break;
                }
            }
            stack.push(num);
        }

        // 아직 k가 남아있으면 뒤에서부터 버림
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}


// 조합으로 다 구한다음에 max를 찾는 방식은 아닐거같음
// 따라서 number를 스캔하면서 '큰 숫자를 남긴다'는 아이디어로 가보자
// 1, 19, 192, 1924 이렇게 스캔할건데 큰 숫자를 남겨야하므로
// 9를 봤을때는 1이 작으니까 버리고 9 다음 2를봤을땐 아직 모르고 4를 보니까 2는 작으니까 버림
// 그러고나면 94가 남는다.

// 현재값과 이전값을 비교하기위해서 이전값의 상태를 쭉 추적해야하고
// O(n)으로 스캔해야하므로 스택이 떠오름
// -> 현재값이 이전값보다 크면 이전거를 버린다 그리고 k를 줄인다.

// 1231234를 보면 (k=3)
// 1, 12 -> 1버림(k=2) 23->2버림(k=1) 31, 312 ->1버림(k=0) 323, 3234

// 계속 큰 수가 나와서 버리지 않았는데 k가 남아있는 경우가 있을 수 있다.
// 그럼 그냥 뒤에서부터 버리면 된다
// 어차피 버릴건 버려야함 + 앞에서부터 작은 수 버려왔고 숫자의 위치를 사수해야되니
// 지금까지 찾아온 값이 충분히 크다 -> 이래서 그리디구나