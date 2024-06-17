# ver1
word = list(input())
reversed_word = list(reversed(word))

if(word == reversed_word):
    print(1)
else:
    print(0)

# ver2
word = input()

for i in range(len(word)):
    if(word[i] == word[-i-1]):
        continue
    else:
        print(0)
        exit(0)
print(1)

# ver3
word = list(input())

if(word == word[::-1]):
    print(1)
else:
    print(0)
