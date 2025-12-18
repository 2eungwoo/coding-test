function trap(height: number[]): number {
    
    let left = 0;
    let right = height.length - 1;
    let lmax = height[left];
    let rmax = height[right];

    let water = 0;
    while(left < right) {
        lmax = Math.max(height[left], lmax);
        rmax = Math.max(height[right], rmax);

        if(lmax < rmax) {
            water += (lmax - height[left]);
            left++;
        } else {
            water += (rmax - height[right]);
            right--;
        }
    }

    return water;
};


/*
    얘는 Container With Rain Water랑 좀 다른게 
    위 문제는 양 끝 막대사이 차오르는 물 넓이를 구하는거고 

    얘는 각 칸마다 물이 차는데 그거의 누적을 구하는거임 
    그래서 해당 칸마다 왼/오 높이를 계속 비교해서 누가 더 긴지 짧은지 대봐야함 
    루프마다 lmax, rmax 구해준다음 물 계산해야됨
    그리고 width 개념 없이 그냥 높이의 차이만큼만 물이 차는거임

    각 칸마다 [왼쪽최대, 오른쪽최대 중에서 짧은 높이] 를 알아야함 
    물은 칸 단위로 누적됨 
    leftmax, rightmax를 계속 추적해야함
    

*/