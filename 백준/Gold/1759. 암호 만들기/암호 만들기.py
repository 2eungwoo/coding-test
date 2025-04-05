import sys
input = sys.stdin.readline

L,C = map(int, input().split())
chars = sorted(input().split())  

answer = []

vowels = {'a', 'e', 'i', 'o', 'u'}

def dfs(start, path):
    if len(path) == L:
        vowel_count = 0
        for ch in path:
            if(ch in vowels):
                vowel_count += 1
        consonant_count = L - vowel_count
        if(vowel_count >= 1 and consonant_count >= 2):
            answer.append("".join(path))
        return

    for i in range(start, C):
        dfs(i + 1, path + [chars[i]])

dfs(0, [])

for pw in answer:
    print(pw)