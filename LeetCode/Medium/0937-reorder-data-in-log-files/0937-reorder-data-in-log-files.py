class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        digits = []
        letters = []

        for val in logs:
            # moves wether 2nd piece of log is number or not
            # ex) "dig1 8"" -> digits, "let1 art" -> letters
            if(val.split()[1].isdigit()):
                digits.append(val)
            else:
                letters.append(val)
        
        # letters list needs to be sorted
        # 1st condition : logs
        # 2nd condition : identifier
        letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))

        return letters + digits

         
            
        
        
    