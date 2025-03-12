def solution(my_string, is_suffix):
    answer = 0
    
    suffix_list = []
    for i in range(len(my_string)):
        suffix_list.append(my_string[-i:])
    
    return 1 if is_suffix in suffix_list else 0