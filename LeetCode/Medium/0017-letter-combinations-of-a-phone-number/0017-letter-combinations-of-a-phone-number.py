class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []

        numpad = {
            "2":"abc",
            "3":"def",
            "4":"ghi",
            "5":"jkl",
            "6":"mno",
            "7":"pqrs",
            "8":"tuv",
            "9":"wxyz"
        }

        res = []

        def sol(index, cur_comb):
            if len(cur_comb) == len(digits):
                res.append(cur_comb)
                return
        
            letters = numpad[digits[index]]
            for letter in letters:
                sol(index + 1, cur_comb + letter)
    
    
        sol(0, "")
        return res
        