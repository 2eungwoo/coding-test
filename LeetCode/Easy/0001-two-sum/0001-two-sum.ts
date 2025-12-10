function twoSum(nums: number[], target: number): number[] {

    const len = nums.length;
    // let arr:number[len][2] = [];  js는 동적배열임
    // let arr:Array<Array<number>> = [];
    let arr:number[][] = [];
    for (let i = 0; i < len; i++) {
        // arr[i][0] = i;
        // arr[0][i] = nums[i];
        arr.push([i, nums[i]]);
    }

    arr.sort((a: number[], b: number[]) => {
        return a[1] - b[1];
    })

    let left = 0;
    let right = nums.length - 1;

    let sum = 0;
    while (left < right) {
        sum = arr[left][1] + arr[right][1];
        if (sum < target) {
            left++;
        }
        else if (sum > target) {
            right--;
        }
        else {
            return [arr[left][0], arr[right][0]];
        }
    }

    return [-1, -1];
};