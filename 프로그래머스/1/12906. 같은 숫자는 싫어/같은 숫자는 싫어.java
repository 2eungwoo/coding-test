import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        // 1. 배열 순회하면서 스택에 넣는다.
        // 2. 직전에 이미 들어갔으면 skip
        // 굳이 스택으로 안하고 배열로 해도 되지 않나? 리스트나?
        List<Integer> list = new ArrayList<>();
        
        int prev = -1;
        for (int n : arr) {
            if (n != prev) {
                list.add(n);
                prev = n;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

// 하나만 남겨야됨 
// 순서가 보장되어야함 -> set 불가능
// arr.length는 최대 1백만
// O(n) 안에 해결이 가능해보임 
// 첫 원소부터 끝까지 돌면서 스택에 넣되
// 이미 스택에 있으면 skip
// arr에 숫자가 연속으로 나타나므로 가능한 접근

// stack의 push() vs add() 차이?