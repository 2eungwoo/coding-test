import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
    
        char[] bArray = before.toCharArray();
        char[] aArray = after.toCharArray();
        Arrays.sort(bArray);
        Arrays.sort(aArray);
        
        return Arrays.equals(bArray, aArray) ? 1 : 0;
    }
}

// 이 문제는 그냥 뒤집어서 만들 수 있냐 가 아니라
// before 내의 알파벳을 재배치 해서 after를 만들 수 있느냐임