import collections

n = int(input())

students = collections.defaultdict(str)

for i in range(n):
    name, score = map(str, input().split())
    students[name] = int(score)
    
sorted_students = collections.OrderedDict(sorted(students.items(), key = lambda x:x[1], reverse=True))
third_student = list(sorted_students.keys())[2]
print(third_student)
