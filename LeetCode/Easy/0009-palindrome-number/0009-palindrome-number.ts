function isPalindrome(x: number): boolean {
    
    if(x < 0) {
        return false;
    }

    const len = Math.floor(Math.log10(x) + 1);
    const arr:Array<number> = [];
    
    for(let i=0; i<len; i++) {
        arr[i] = x % 10;
        x = Math.floor(x/10);
    }

    let left = 0;
    let right = len - 1;

    while(left < right) {
        if(arr[left] == arr[right]) {
            left++;
            right--;
        } else {
            return false;
        }
    }

    return true;
};