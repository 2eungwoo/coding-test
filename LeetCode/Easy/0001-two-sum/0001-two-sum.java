// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int[][] arr = new int[n][2]; // <값, 인덱스>
//         for(int i=0; i<n; i++) {
//             arr[i][0] = nums[i];
//             arr[i][1] = i;
//         }

        // Arrays.sort(arr, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a, int[] b) {
        //         return Integer.compare(a[0], b[0]);
        //     }
        // });
        
//        int left = 0;
//        int right = n - 1;
       
//        while(left < right) {
//             int sum = arr[left][0] + arr[right][0];
//             if(sum < target) {
//                 left++;
//             } else if(sum > target) {
//                 right--;
//             } else if(sum == target) {
//                 return new int[]{arr[left][1], arr[right][1]};
//             }
//        }

//        return new int[]{-1};
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
        int[][] arr = new int[len][2]; // <val, idx>
        for(int i=0; i<len; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a,b) -> {
            return a[0] - b[0];
        });
      

        int left = 0;
        int right = len - 1;

        while(left < right) {
            int sum = arr[left][0] + arr[right][0];

            if(sum < target) {
                left++;
            } else if(sum > target) {
                right--;
            } else {
                return new int[]{arr[left][1], arr[right][1]};
            }
        }

        return new int[]{-1,-1};
    }
}

/*
    use two-pointer 
    but need keep tracking idx 
    i need to kind a data-setting to set val with idx
    then sort by value-based ascending

    1. setting data 
        ㄴ set <val,idx> to the other list
    2. two-pointer, find the position(left,right) -> return new int []{left, right}
*/