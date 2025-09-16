class Solution {
    private static final int SATURDAY_IDX = 5;
    private static final int SUNDAY_IDX = 6;
    
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        // 출근 인정 시각 구하기
        int[] acceptedTime = new int[schedules.length];
        for(int i=0; i<schedules.length; i++) {
            acceptedTime[i] = getTime(schedules[i]);
        }
        
        // 근무표에서 비교하기
        int cnt = 0;
        for(int i=0; i<timelogs.length; i++) {
            boolean isLate = false;
            for(int j=0; j<timelogs[i].length; j++) {
                int day = (startday + j - 1) % 7;
                if(day == SATURDAY_IDX || day == SUNDAY_IDX) continue;
                if(acceptedTime[i] < timelogs[i][j]) { // 하루라도 지각하면
                    isLate = true;
                    break; // 직원i는 탈락 break
                }
            }
            if(!isLate) {
                cnt++;
            }
        } 
        return cnt;
    }
    
    private int getTime(int schedule) {
        // 855
        int h = schedule / 100; // 8
        int m = schedule % 100; // 55
        
        if(0 <= m && m < 50) { // 730, h=7, m=40
            m += 10; 
        }else {
            h += 1; // 855 => h=9, m=5
            m -= 50;
        }
        
        return h * 100 + m;
    }
}

/*
    for(int i) {
        i:직원
        for(int j) {
            j:요일
        }
    }
*/