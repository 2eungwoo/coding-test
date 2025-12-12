class Solution {
    public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> triangle = new ArrayList<>();
    // <<>> 이런 형태로 만들고
    // 하나 돌때마다 List를 새로 넣어서 rwo로 써주면
    // 이차원 배열 느낌이 날거임

    for(int i=0; i<numRows; i++) {
        List<Integer> row = new ArrayList<>();
        for(int j=0; j<=i; j++) {
            if(j == 0 || j == i) {
                row.add(1);
            } 
            else {
                List<Integer> prevRow = triangle.get(i-1);
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
        }
        triangle.add(row);
    }

    return triangle;
    }
};

/*
    파스칼 삼각형을 이차원 배열로 만들어보면
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1

    이중포문 돌면서 값을 채워주면 됨
    맨처음이랑 맨 마지막은 1로채우면되고
    -> if (j == 0 || j == i) tri[i][j] = 1
        else tri[i][j] = 합값

    합값 : 
    121에서 2는 a[2][1] = a[1][0] + a[1][1]
    1331에서 
    첫번째3은 a[3][1] = a[2][0] + a[2][1]
    두번쨰3은 a[3][2] = a[2][1] + a[2][2]
    그니까 a[i][j] = a[i-1][j-1] + a[i-1][j] 임
*/