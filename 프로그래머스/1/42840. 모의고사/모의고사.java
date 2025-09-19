import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;

        // 1,2,3 번 수포자의 답안지를 각각 만든다.
        int[] first = new int[len];
        int[] second = new int[len];
        int[] third = new int[len];

        fillNumberFirst(len, first);
        fillNumberSecond(len, second);
        fillNumberThird(len, third);

        // 1,2,3 번 시험지를 모두 채점해서 그 중 가장 많이 맞은 답의 개수를 구함
        // 채점은 각각의 시험지와 answer를 비교함
        int[] count = new int[3];
        int max = findMax(first, second, third, answers, count);

        // 가장 많이 맞춘 사람의 인덱스를 1-based로 해서 리턴
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == max) list.add(i + 1);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void fillNumberFirst(int len, int[] first) {
        int[] pattern = {1, 2, 3, 4, 5};
        for (int i = 0; i < len; i++) {
            first[i] = pattern[i % 5];
        }
    }

    private void fillNumberSecond(int len, int[] second) {
        int[] pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        for (int i = 0; i < len; i++) {
            second[i] = pattern[i % 8];
        }
    }

    private void fillNumberThird(int len, int[] third) {
        int[] pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < len; i++) {
            third[i] = pattern[i % 10];
        }
    }

    private int findMax(int[] first, int[] second, int[] third, int[] answers, int[] count) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i]) count[0]++;
            if (answers[i] == second[i]) count[1]++;
            if (answers[i] == third[i]) count[2]++;
        }
        return Math.max(count[0], Math.max(count[1], count[2]));
    }
}