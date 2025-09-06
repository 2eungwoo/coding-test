class Solution {
    public int[] solution(int brown, int yellow) {
        
        for (int width = 3; width <= 5000; width++) {
            for (int height = 3; height <= width; height++) {
                int boundary = (width + height - 2) * 2;
                int center = width * height - boundary;

                if (boundary == brown && center == yellow) {
                    return new int[] { width, height };
                }
            }
        }

        return null;
    }
}

// x * y - yellow = brown
// brown + yellow = x * y

// x*y = 48일떄
// x,y 가능한 쌍을 모두 찾는다?
// 1 48, 2 24, 3 16, 4 12, 6 8, 8 6, 12 4, 16 3, 24 2, 48 1

// 48과 24의 공약수
// 1,2,3,4,6,8,12,24

// ---
// x*y = 12, 
// 1 12, 2 6, 3 4, 4 3, 6 2, 12 1
// 가로 >= 세로
// => 뒤쪽에있는 애들만 항상 해당된다.
// (4 3), (6 2), (12 1)

// yellow는 가운데 들어가야하므로.. 상화좌우 여유공간 최소 1칸씩 있어야함
// 8 6, 12 4, 16 3, 24 2, 48 1
/*
 ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
 ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
 ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
*/

// 가운데 들어가는거 개수에만 집중하지말고..
// 가운데 개수는 전체-가장자리 이니까
// 전체는 W x H
// 가장자리는 2W + 2(H-2) ==> 이게 brown
// 가운데는 WH - 가장자리 ==> 이게 yellow
// yellow는 가운데 들어가야하므로.. 상화좌우 여유공간 최소 1칸씩 있어야함
// => 따라서 가로세로가 최소 길이 3은 되어야함