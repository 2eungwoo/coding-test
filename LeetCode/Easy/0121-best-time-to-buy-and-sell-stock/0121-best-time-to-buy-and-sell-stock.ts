function maxProfit(prices: number[]) : number {

    let min: number = Infinity;
    let max: number = 0; 

    for(const p of prices) {
        if(p < min) {
            min = p;
        } else {
            max = Math.max(max, p - min);
        }
    }

    return max;
}

/*
    최신 상태만 알면 되니까 스택 쓴건데
    마찬가지로 이런 이유라면 상수값만으로 컨트롤 가능
    해야되는게 prices[] 에서 최소가격이랑
    한 번 스캔 안에서 게속 max값 비교/갱신 하면 됨 

    근데 이익이 없으면 0을 반환해야되니까
    갱신이 안된 상황에 대비해서 max 초기 0 그대로 리턴하면 됨
*/