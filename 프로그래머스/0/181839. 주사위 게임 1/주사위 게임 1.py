def solution(a, b):
    # 모두 홀수
    if(a % 2 != 0 and b % 2 != 0):
        return a**2 + b**2
    
    # 하나만 홀수
    if(a % 2 != 0 or b % 2 != 0):
        return 2 * (a + b)
        
    # 모두 짝수
    if(a % 2 == 0 and b % 2 == 0):
        return abs(a-b)
