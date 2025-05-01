class Solution:
    def calPoints(self, operations: List[str]) -> int:
        scores = []

        for c in operations:
            if(c == '+'):
                scores.append(scores[-1] + scores[-2])
            elif(c == 'D'):
                scores.append(scores[-1] * 2)
            elif(c == 'C'):
                scores.pop()
            else:
                scores.append(int(c))
                

        return sum(scores)