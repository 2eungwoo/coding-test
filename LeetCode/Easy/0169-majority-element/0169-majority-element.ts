// function majorityElement(nums: number[]): number {
    
//     const middle = Math.floor(nums.length / 2);
//     nums.sort((a,b) => a - b);
//     return nums[middle];
    
// };

function majorityElement(nums: number[]): number {
    let candidate = 0;
    let count = 0;

    for(const n of nums) {
        if(count == 0) {
            candidate = n;
            count = 1;
        } else if (candidate === n) {
            count++;
        } else {
            count--;
        }
    }

    return candidate;
}   

/*
    <Boyer-Moore 다수결 알고리즘>
    
    배열에서 과반수 초과(len/2)로 등장하는 원소가 반드시 있다고 하면,
    서로 다른 값들을 일대일로 상쇄시킨다면 마지막에 남는 값이 항상 다수결에 포함된 원소임
    
    - candidate : 현재 후보
    - count     : 후보의 상대적 우위(등장 횟수 차이)
    이렇게 놓고 

    1) 배열 순회
    2) count==0 이면 현재 값을 후보로 등록, count=1
       이전까지의 후보는 다른 값들과 상쇄(count=0), 더 이상 세는 의미가 없다.
    3) 현재 값이 후보랑 동일하면 count++, 다르면 count-- 해서 한 쌍씩 제거함

    다수결 이상을 가진 원소는 전체 개수의 절반을 초과하기 때문에
    각각 다른 값들이랑 일대일 상쇄시키다보면 마지막에 최소 한 개 이상 남는다.

    TC : O(N)
    SC : O(1)

*/
