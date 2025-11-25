import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;

        for(int i=0; i<len; i++) {
            if(!stack.isEmpty() && stack.peek() == arr[i]) {
                continue;
            }
            stack.push(arr[i]);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }   
}

/*
    중복을 제거하되, 순서를 유지해야한다.
    단순 set에 넣으면 안된다.
    <val,idx> 로 놓고 정렬을한다? 
    nlogn이면 1000000000000 이라서 안됨

    연속적으로 나타나는 숫자만 제거하면 된다.
    따라서 첫 1이랑 끝1 이 있을 때 제거할 필요가 없고
    첫1이랑 바로 다음1이 나온 경우에만 그 1을 스킵하면 됨
    
    스택을 써서 요소를 돌면서 
    현재 탑에 있으면 스킵
    혀재 탑에 없으면 푸쉬
*/