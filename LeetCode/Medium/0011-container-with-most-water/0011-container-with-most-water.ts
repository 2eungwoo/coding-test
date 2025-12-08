function maxArea(height: number[]): number {
    let left:number = 0;
    let right:number = height.length - 1;
    let result = -Infinity;

    let water:number = 0;
    while(left < right) {
        const w = right - left;
        const h = Math.min(height[left], height[right]);
        water = w * h;
        result = Math.max(result, water);

        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return result;
}; 


/*
    물 높이를 구하는 방법은
    좌/우 비교헀을때 작은쪽 기준이 높이가되고
    둘 사이의 인덱스 차이가 넓이가 됨
    따라서 min(h[right], h[left]) 랑 right-left를 곱하면 그 right,left값의 water가 됨

    투포인터로 구간을 다 구해서 max를 찾아줄건데
    포인터가 양쪽에서 좁혀가면서, 이동조건은 높이가 작은쪽의 높이ㄷ쪽 포인터를 땅겨줄거임
    거긴 이미 계산했으니까 새로운 계산을 하기 위함임
*/


