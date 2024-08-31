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

        # digits : ex) 23 -> abc, def
        # digits[i] -> 2, 3
        # numpad[digits[i]] -> abc, def ... letters

        def sol(idx, cur_comb):
            if(len(cur_comb) == len(digits)):
                res.append(cur_comb)
                return

            letters = numpad[digits[idx]]
            for letter in letters:
                sol(idx + 1, cur_comb + letter)

        res = []
        sol(0,"") # idx, cur_combinations
        return res
