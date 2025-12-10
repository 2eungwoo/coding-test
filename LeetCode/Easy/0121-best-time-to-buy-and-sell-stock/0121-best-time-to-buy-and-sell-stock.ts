function maxProfit(prices: number[]): number {

    let stack: number[] = [];
    const len = prices.length;
    let max = -1;

    for (let i = 0; i < len; i++) {
        if (stack.length === 0) {
            stack.push(prices[i]);
        } else {
            if (stack[stack.length - 1] > prices[i]) {
                max = Math.max(max, prices[i] - stack[stack.length - 1]);
                stack.push(prices[i]);
            } else {
                max = Math.max(max, prices[i] - stack[stack.length - 1]);
            }
        }
    }

    if (max === -1) {
        return 0;
    } else {
        return max;
    }
}