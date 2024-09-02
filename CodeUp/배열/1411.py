n = int(input())
cards = []

for _ in range(n-1):
    cards.append(int(input()))

for i in range(1,n+1):
   if i not in cards:
        print(i)
