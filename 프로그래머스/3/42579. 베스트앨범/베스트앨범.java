import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playCountsByGenres = new HashMap<>();
        Map<String, List<int[]>> playCountsByIndex = new HashMap<>();
    
        for (int i = 0; i < plays.length; i++) {
            playCountsByGenres.put(genres[i], playCountsByGenres.getOrDefault(genres[i], 0) + plays[i]);
            playCountsByIndex.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[] { i, plays[i] });
        }

        List<String> genreOrder = new ArrayList<>(playCountsByGenres.keySet());
        genreOrder.sort((a, b) -> playCountsByGenres.get(b) - playCountsByGenres.get(a));

        List<Integer> result = new ArrayList<>();
        for (String g : genreOrder) {
            List<int[]> list = playCountsByIndex.get(g);
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    if (b[1] == a[1]) // playCount가 같으면 
                        return a[0] - b[0]; // index 오름차순
                    return b[1] - a[1]; // 기본은 playCount 내림차순
                }
            });
            for(int i=0; i<Math.min(2, list.size()); i++) { // 최대 2개까지
                result.add(list.get(i)[0]); // index번호 담고
            }
        }
        
        // 배열에 담아서 리턴
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    
    }
}

// 장르별로 재생 횟수를 알아야하므로 해시맵을 사용해서 넣음
// 고유번호별로 재생횟수를 알아야하므로 해시맵을 사용해서 넣음, 이 때 장르별로 알아야하고, 고유번호와 재생횟수를 알아야하므로
// 장르별, 재생횟수+고유번호 이렇게 들고있도록 해시맵을 구성