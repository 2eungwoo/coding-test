function generate(numRows: number): number[][] {

    // let triangle: Array<Array<number>> = [];
    let triangle: number[][] = [];

    for(let i=0; i<numRows; i++) {
        // let row: Array<number> = [];
        let row: number[] = [];
        for(let j=0; j<=i; j++) {
            if(j == 0 || j == i) {
                row.push(1);
            }
            else {
                const prevRow: number[] = triangle[i-1];
                row.push(prevRow[j] + prevRow[j-1]);
            }
        }
        triangle.push(row);

    }

    return triangle;
    
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