import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            String filtered = s.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(filtered)) {
                answer++;
            }
        }
        
        return answer;
    }
}
// 다음걸 안찍는건 ㄱㅊ은데 이전꺼는 반드시 찍어야됨

// skill_trees 상에서 skill에 없는 문자는 일단 다 없앤다. -> reg_expression
// 지우고나면 없는건 걍 없는 채로 남아있을거임
// skill 문자열에서 filtered로 시작하는애가 있냐를 찾는다. skill.startsWith(filtered)
