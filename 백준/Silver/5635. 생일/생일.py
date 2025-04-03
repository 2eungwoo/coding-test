import sys
input = sys.stdin.readline

n = int(input())
students = []

for i in range(n):
    name, day, month, year = input().split()
    students.append((name, int(year), int(month), int(day)))
    
students.sort(key=lambda st:(st[1],st[2],st[3]))

print(students[-1][0],students[0][0],sep='\n')