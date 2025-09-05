import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        // Arrays.sort(arr, new Comparator<String>() {
        //     @Override
        //     public int compare(String a, String b) {
        //         return (b + a).compareTo(a + b);
        //     }
        // });

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}

// 주어진 정수로 만들 수 있는 가지 수 : N!
// numbers 길이는 100000 이므로 N! 다 돌면 무조건 시간초과 예상

// 그럼 완전탐색 안되니까 경우의 수 안돌고 가장 큰 수를 만들기 위해서는
// 앞자리 수 기준 정렬해주자

// 두자리수 이상 정수라면??

// 3 vs 30 => 330 vs 303 => 330
// 330 vs 34 => 33034 vs 34330 => 34330
// 34330 vs 5 => 534330 vs 343005 => 534330
// 534330 vs 9 => 9534330 vs 5343309

// 근데 이거 버블정렬인데 N^2 나오는데 어케품?