import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      Map<String, Integer> bookMap = new HashMap<>();
      
      for(int i=0; i<n; i++) {
        String book = sc.next();
        bookMap.put(book, bookMap.getOrDefault(book,0)+1);
      }
     
     int max = Collections.max(bookMap.values());
     List<String> list = new ArrayList<>();
     
     for(String key : bookMap.keySet()) {
       if(bookMap.get(key) == max){
         list.add(key);
       }
     }
     
     Collections.sort(list);
     System.out.println(list.get(0));
    }
}