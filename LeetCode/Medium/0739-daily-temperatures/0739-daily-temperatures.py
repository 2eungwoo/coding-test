class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        res = [0] * len(temperatures)

        for i,t in enumerate(temperatures):

            while(stack and stack[-1][1] < t):
                pop_idx, pop_t = stack.pop()
                res[pop_idx] = i - pop_idx
                
            stack.append((i,t))

        return res