def solution(code):
    ret = ''
    mode = True  

    for idx,c in enumerate(code):
        if(c == '1'):
            mode = not mode
        
        if(mode):
            if(c != '1' and idx % 2 == 0):
                ret += c
        else:
            if(c != '1' and idx % 2 != 0):
                ret += c
    
    if(ret == ''):
        return "EMPTY"
    else:
        return ret
