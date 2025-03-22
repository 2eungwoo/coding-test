def solution(myStr):
    answer = []
    for c in ['a','b','c']:
        myStr = myStr.replace(c,' ')
        
    answer = myStr.split()
    
    return ["EMPTY"] if not answer else answer