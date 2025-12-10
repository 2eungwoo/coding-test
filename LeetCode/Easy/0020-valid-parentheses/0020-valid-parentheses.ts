function isValid(s: string): boolean {
    

    const map = new Map([
        [')','('],
        [']','['],
        ['}','{']
    ]);
    let stack:Array<string> = [];

    for(const char of s) {
        if(map.has(char)) {
            if(stack.length === 0 || stack.pop() !== map.get(char)) {
                return false;
            }
        } else {
            stack.push(char);
        }
    }
    
    return stack.length === 0;
};