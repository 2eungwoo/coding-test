import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (set.contains(c)) {
                continue;
            }
            set.add(c);
            sb.append(c);
        }

        return sb.toString();
        
        
        
    }
}

// my_string 원소를 돌면서 중복을 제거해서 데이터를 세팅한다
// 중복 제거 --> Set 사용

// 입력예제 2를 보면 공백도 역시 중복으로 인정되므로 
// my_string을 char요소로 담아서 중복을 제거하도록 한다

// Set에 넣으면 순서가 보장되지 않으므로 처리를 또 해줘야함
// my_string이랑 Set을 비교하면서 존재하면 skip