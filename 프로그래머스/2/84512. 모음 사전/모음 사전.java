import java.util.List;
import java.util.ArrayList;

class Solution {

    private final static Character[] ALPHA = {'A','E','I','O','U'};    

    public int solution(String word) {
        
        List<String> wordList = new ArrayList<>();

        generate("",wordList); // curComb, wordList
        
        return wordList.indexOf(word) + 1;
    }

    private void generate(String curComb, List<String> wordList) {
        // 현재 값 
        if(curComb.length() == 6) {
            return;
        }

        if(!curComb.equals("")) {
            wordList.add(curComb);
        }

        // 다음 값
        for(int i=0; i<5; i++) {
           generate(curComb + ALPHA[i], wordList);
        }
    }

}


/*
    A 
    AA 
    AAA 
    AAAA 
    AAAAA 
    AAAAE 
    AAAAI 
    ...
    UUUUO
    UUUUU

    모든 가짓수는 5^5 => 3125 

    단어 리스트를 쭉 만들어놓고 
    그 중 word가 몇 번째에 있느냐를 리턴
    collectioins의 indexOf

*/


/*
    단어를 쭉 만들어보고, 
    word가 그 단어 리스트에 몇 번째 있느냐 구함

    경우의 수 : 5^5 => 3125 

    A부터 시작해서 U까지 순차적으로 조합해서 만들어서
    사전순으로 정렬된 리스트를 만들어야함
*/