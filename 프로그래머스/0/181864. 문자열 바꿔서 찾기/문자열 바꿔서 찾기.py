def solution(myString, pat):
    answer = 0
    
    newStrings = ""
    for c in myString:
        newStrings += swap(c)
        
    return 1 if pat in newStrings else 0

def swap(c):
    return 'A' if c == 'B' else 'B'