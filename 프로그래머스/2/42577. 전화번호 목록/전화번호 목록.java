import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
        
        
//         // Set<String> set = new HashSet<>();
//         // for(String s : phone_book) {
//         //     set.add(s);
//         // }
//         Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        
//         for(String num : phone_book) {
//             StringBuilder prefix = new StringBuilder();
//             for(int i=0; i<num.length() - 1; i++) {
//                 prefix.append(num.charAt(i));
//                 if(set.contains(prefix.toString())){
//                     return false;  
//                 } 
//             }
//         }
//         return true;
//     }

// }