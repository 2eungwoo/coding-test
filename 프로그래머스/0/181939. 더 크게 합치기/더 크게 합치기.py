def solution(a, b):
    answer = 0
    s_a = str(a)
    s_b = str(b)
    # answer = int(s_a + s_b)
    a_and_b = int(s_a + s_b)
    b_and_a = int(s_b + s_a)
    if(a_and_b > b_and_a):
        return a_and_b
    else:
        return b_and_a


