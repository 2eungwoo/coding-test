def solution(my_string, overwrite_string, s):
    tail = len(overwrite_string)
    answer = my_string[:s] + overwrite_string + my_string[tail+s:]
    return answer