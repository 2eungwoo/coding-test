import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
    여분 가져온애가 도난당할 수 있음
    lost [2,4]
    reserve [1,2,3,4] 이런 경우면
    2,4는 자기꺼 써야됨 못빌려줌
    
    여분 가져왔으나 못빌려주는 경우는 교집합이므로 제외해야함
*/


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = processLostList(lost, reserve);
        List<Integer> reserveList = processReserveList(lost, reserve);
        
        borrow(lostList, reserveList);
        
        return n - lostList.size();
    }
    
    // 자신꺼 도난당했는데 여분이 있는 교집합 제거
    // lost에 있고 reserve도 있는 경우
    private List<Integer> processLostList(int[] lost, int[] reserve) {
        List<Integer> result = new ArrayList<>();
        for(int l : lost) {
            boolean duplicated = false;
            for(int r : reserve) {
                if(l == r) {
                    duplicated = true;
                    break;
                }
            }
            if(!duplicated) {
                result.add(l);
            }
                
        }
        Collections.sort(result);
        return result;
    }

    // 가져왔는데 도난당한 교집합 제거
    // reserve에 있고 lost에도 있는 경우
    private List<Integer> processReserveList(int[] lost, int[] reserve) {
        List<Integer> result = new ArrayList<>();
        for (int r : reserve) {
            boolean duplicated = false;
            for (int l : lost) {
                if (r == l) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) result.add(r);
        }
        Collections.sort(result);
        return result;
    }

    // 빌려주기
    // reserve 리스트에 lost 리스트에 있는 값이 있으면(contains) 빌려줄 수 있으므로
    // 그 녀석을 lost에서 제외
    // 앞뒤로 빌려줄 수 있으니 i-1, i+1 에 contains인지 확인 후 각각 i-1 or i+1 remove
    private void borrow(List<Integer> lostList, List<Integer> reserveList) {
        for(int r : reserveList) {
            if(lostList.contains(r-1)){
                lostList.remove(Integer.valueOf(r-1));
            } else if(lostList.contains(r+1)) {
                lostList.remove(Integer.valueOf(r+1));
            }
        }
    }
}