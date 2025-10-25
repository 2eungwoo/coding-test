import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  String str = br.readLine();
		  String bomb = br.readLine();
		  
		  Stack<Character> stack = new Stack<>();
		  int bombLen = bomb.length();
		  
		  for(char c : str.toCharArray()) {
		    stack.push(c);
		    
		    // bomblen 보다는 많이 넣어놔야 비교 가능
		    if(stack.size() >= bombLen) {
		      boolean isBomb = true;
		      
		      for(int i=0; i<bombLen; i++) {
		        int window = stack.size() - bombLen + i;
		        if(stack.get(window) != bomb.charAt(i)) {
		          isBomb = false; // 한 글자라도 다르면 false
		          break;
		        }
		      }
		      
		      if(isBomb) {
		        for(int i=0; i<bombLen; i++) {
		          stack.pop();
		        }
		      }
		      
		    }
		    
		  }
		  
		  if(stack.isEmpty()) {
		    System.out.println("FRULA");
		  } else {
		    StringBuilder sb = new StringBuilder();
		    for(char c : stack) {
		      sb.append(c);
		    }
		    System.out.println(sb.toString());
		  }
  }
}

// 문자열 길이가 최대 100만이라
// O(N^2) 이하로 풀어야되고
// string.replace(bomb, "") 이런식으로 하면
// 지우고나서 또 원본 문자열을 스캔해서 계속 지워야하므로
// CC44 -> c4 -> '' 엔제곱번 돌아야함 그래서 안됨

// 애초에 한번 스캔하면서 있으면 지우는 방식으로 -> 스택 

// 1. 문자열을 하나씩 입력 받는다. (스택에)
// 2. 스택에 넣으면서 그 항상 bomb이랑 비교함 
//     ㄴ 이 때 bomb.length() 를 사용
//  CC44 -> C4 지우고 4 들어오면 다시 C4 남으니까 지우는 방식 
// 3. 다 돌고 스택이 비었느냐 아니냐에 따라 출력 분기
