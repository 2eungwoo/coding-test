def solution(my_string, is_prefix):
    answer = 0
    
    prefix_list = []
    
    for i in range(len(my_string)):
        prefix_list.append(my_string[0:i])
    
    return 1 if is_prefix in prefix_list else 0