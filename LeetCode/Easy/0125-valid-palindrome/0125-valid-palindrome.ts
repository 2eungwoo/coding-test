function isPalindrome(s: string): boolean {

    // String parsed = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    let parsed: string = s.toLowerCase().replaceAll(/[^a-z0-9]/g, "");
    if (parsed.length === 0) {
        return true;
    }

    let left: number = 0;
    let right: number = parsed.length - 1;

    while (left < right) {
        if (parsed[left] == parsed[right]) {
            left++;
            right--;
        }
        else {
            return false;
        }
    }

    return true;
};