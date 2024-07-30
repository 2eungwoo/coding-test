# coding-test
[![Solved.ac Profile](http://mazassumnida.wtf/api/mini/generate_badge?boj=swo98)](https://solved.ac/swo98)

### [풀이피드백](#풀이피드백)
- [boj12345](#boj12345)
- [dp배열 초기값 넣을때 실수 주의](#codeup2632)

### [파이썬 익숙해지기](#Python)
- [입력](#입력)
- [출력](#출력)
- [리스트](#리스트)
  - [내장함수](#내장함수)
  - [내장메서드](#내장메서드)
- [딕셔너리](#딕셔너리)
    - [딕셔너리 모듈](#딕셔너리모듈)
- [리스트, 딕셔너리 주요 시간복잡도 차이](#리스트vs딕셔너리)
- [list 초기 세팅](#리스트초기세팅)
  - [list 입력 주의사항](#주의사항)
- [swap 쉽게하기](#swap쉽게하기)
- [pass,exit](#pass,exit)
- [round](#round)
- [연산자](#연산자)
- [map함수](#map함수)
- [sum함수](#sum함수)
- [sort() vs sorted()](#정렬)
- [무한대값 지정하기](#무한대값)

### ETC 
- [입력값 범위에 따른 시간제한 계산](#입력값)
- [재귀 깊이 설정](#재귀깊이설정)

# 풀이피드백
### boj12345

### codeup2632
```python
n = int(input())

stair = [0] * (n+1)
stair[1] = 1
stair[2] = 2

# 여기서 n == 0이면, 길이가 1인 배열이 생기는데,(idx:0만 존재)
# stair[1]에 1을 할당하고 있으니 에러가 발생함

# n == 1이면, [stair[0], stair[1]] 만 있는데 stair[2]에 할당하니까 에러
```
------------------
# Python
### 입력
```python
n = int(input())

n1, n2 = map(int, input().split())

# 한 줄로 입력받기
list = list(map(int, input().split()))

# 리스트 사이즈 n 이 주어지고
# n 회 값을 입력받아 리스트에 담기
# ex) n = 4, 입력 : 1 2 3 4
n = int(input())
list = list(map(int,input().split()))
print(list)
>> 1 2 3 4
```
```python
# sys.stdin.readline()로 입력받기 -> 입력 시간초과 방지

import sys 
변수 = sys.stdin.readline()
```
```python
import sys
input = sys.stdin.readline

n = int(input())
for i in range(n):
    a,b = map(int, input().split())
    print(a+b)

```
------------------
### 출력
```python
# print 개행없애고 공백 하나씩 넣기
print(val, end=" ")
```
```python
# list안의 요소 한줄로 출력하기
list = [1,2,3,4,5]
print(*list)
```
```python
# list안의 요소 join으로 end처리

list = ['a','b','c']
print('#'.join(list))
>> a#b#c

# join은 문자열 리스트에만 가능
# 정 쓰고싶으면 다음과 같이 map함수로 str 돌려줘야됨
print(' '.join(map(str, list)))
```
```python
# 소수점 n번째 자리까지 출력
print(format(result,'.nf'))
```
```python
# print 함수에서는 기본적으로 인자 사이에 공백이 출력되기 때문에
# 개행 넣어서 출력하고싶으면 다음과 같은 형식으로 작성해야함

print(f"{min}\n{sec}")
```
```python
#
return [*results.values()]
return list(results.values)
```
```python
# 대소문자 바꿔서 출력하기
str.swapcase()
```
------------------
### 딕셔너리
### 딕셔너리모듈
#### defaultdict 객체
```python
# 존재하지 않는 키를 조회할 경우, 디폴트 값을 기준으로 해당 키에 대한 딕셔너리 아이템을 생성해준다.
import collections
a = collections.defaultdict(int)
a['A'] = 5
a['B'] = 4
print(a)
>>> defaultdict(<class 'int'>, {'A':5,'B':4})
a['C'] += 3
print(a)
>>> defaultdict(<class 'int'>, {'A':5,'B':4,'C':3})
```
```python
defaultdict()에서 괄호 안에는 int, list, set 과 같이 기본 값을 생성하는 함수를 넣는다 (사용자 생성 가능)
defaultdict(int) : 기본 값이 0인 딕셔너리 생성
defaultdict(list) : 기본 값이 빈 배열인 딕셔너리 생성
defaultdict(set) : 기본 값이 빈 집합인 딕셔너리 생성
```
#### Counter 객체
```python
# 아이템에 대한 개수를 계산해 딕셔너리로 리턴한다.
# key에는 아이템의 값, 값에는 해당 아이템의 개수가 들어간 딕셔너리를 생성한다.
import collections

a = ['a','b','c','c','d','d','d']
b = collections.Counter(a)

print(b)
>>> Counter({'d': 3, 'c': 2, 'a': 1, 'b': 1})
```
#### 가장 높은 빈도수 요소 추출하기
```python
# most_common() 함수 사용
print(b.most_common())
>>> [('d', 3), ('c', 2), ('a', 1), ('b', 1)]

b.most_common(n) -> n개를 추출
b.most_common(1) -> [('d', 3)] 이므로, b.most_common(1)[0][0]으로 최빈값의 key를, b.most_common(1)[0][1]로 최빈값의 값을 추출할 수 있다.
```

------------------

### 리스트vs딕셔너리
#### List

| Index | li[idx] | O(1) |
| --- | --- | --- |
| Length | len(li) | O(1) |
| Pop | li.pop() | O(1) |
| Delete | li[idx] | O(N) |
| Remove | li.remove(val) | O(N) |

#### Dictionary

| Index | dic[key] | O(1) |
| --- | --- | --- |
| Length | len(dic) | O(1) |
| Pop | dic.pop(key) | O(1) |
| Delete | del dic[key] | O(1) |

------------------

### 리스트
파이썬은 다른 언어들과 다르게 반대방향으로의 indexing 가능</br>
요소가 6개인 리스트에서,</br>
정방향 : 인덱스 5까지 </br>
역방향 : 인덱스 -6까지 ( li[-6] == li[0] )</br>

#### 내장함수
```python
len(list)
max(list)
min(list)
list(tup)
```
#### 내장메서드
```python
list.append(val) : 리스트 끝에 1개 요소(val) 추가
list.extend(li2) : 리스트 끝에 다른 리스트(li2) 붙이기
list.cound(val) : 리스트 내부 요소(val) 개수 반환
list.index(val) : 리스트 내부 해당 요소(val)의 인덱스(최소값) 값 반환
list.insert(idx,val) : 리스트의 해당 인덱스(idx)위치에 요소(val) 삽입
list.pop() : 리스트 마지막 요소 제거, 제거된 요소 반환. 
  list.pop(idx) : 해당 idx 요소 제거
list.remove(val) : 리스트에서 해당 요소(val) 제거
list.reverse() : 리스트 뒤집기
list.sort() : 리스트 정렬
  default = ascending
  list.sort(reverse = True) : descending
  
```
------------------
### 리스트초기세팅 
```python
# 리스트를 빈 값으로 초기화하고 동적으로 할당하면 안됨
list = []

for i in range(n+1):
    list[i] = i # error
```

```python
# 이렇게 크기 주고 초기화 한다음 값 넣어줘야됨
list = [None] * (n+1)

for i in range(n+1):
    list[i] = i
```

```python
# 아니면 append()로 넣어주던가
list = []

for i in range(n+1):
    list.append(i)
```
```python
# list를 [1,2,3,4...,n] 으로 쉽게 초기화해주는 방법
list = [x for x in range(1,n+1)]
```
```python
# 2차원 배열 만들기 
# ex) n개 줄, 원소 m개 
m = [[0 for col in range(m)] for row in range(n)]

# 10 by 10 짜리 2차원 배열
lst = [['#'] * 10 for _ in range(10)]

# 입력으로 값 채워넣기
for i in range(n):
    m[i] = list(map(int, input().split()))
```
### 주의사항
```python
# 배열에 원소 추가할 때 인덱스로 접근하기
# 배열에 원소를 추가하면 보통 빈 배열을 만들고 append 로 추가할 때가 많은데,
# 입력 받을 개수(N)를 알고있다면 N 만큼 배열을 초기화해두고 인덱스로 각자 접근해서 저장하는 것이 효율이 좋다.

## 7의 배수 10개 저장하기
# 수정 전
arr = []
for num in range(1, 11):
    arr.append(num * 7)
    
# 수정 후
arr = [0 for _ in range(10)]
for num in range(1, 11):
    arr[num] = num * 7

# 아니면 이거? (n:10일때)
arr = [None] * 10
```
------------------
### swap쉽게하기
```python
swap(a,b) 는
a,b = b,a 로 가능
```
------------------
### pass,exit
pass
```
파이썬에서 pass는 Null 연산으로 아무것도 하지 않는 기능
```
```python
for i in range(1,5):
  if(i==3):
    pass
  print(i)

# 1 2 3 4 5

# continue 였으면 1 2 4 5 인거랑 다른거 기억
```

exit
```python
for i in range(1,5):
  if(i==3):
    exit()
  print(i)
print("abc")

# 1 2
```
------------------
### round
```python
# python3에서 round함수는 사사오입 원칙을 따른다.
# 소수점 부분이 정확히 0.5로 나오면, 반올림 할때 앞자리가 홀수면 올림, 짝수면 내림

print(round(5.5))
# 6

print(round(4.5)) 
# 4
```
------------------
### 연산자
```python
# 나눗셈
a = 10
b = 3

print(a/b) # 3.3333333333333335
print(a//b) # 3

# 몫, 나머지 한번에 구하기
divmod(5,3)
>> (1,2)
```
------------------
### map함수
```python
# 각 자리수 쉽게 더하기 (n:int)
# sum함수 , map함수

n = int(input())
result = sum(map(int,str(n1)))

str = input()
result2 = sum(map(int,str))
```
------------------
### sum함수
```python
list = [1,2,3,4,5]

sum1 = 0
for i in range(len(list)):
    sum1 += list[i]

# sum함수
sum2 = sum(list)

print(sum1,sum2)
```
------------------
### 정렬
sort()
```python
list.sort(key=None, reverse=False)
```
sorted()
```python
sorted(iterable, key=None, reverse=False)
```
------------------
### 무한대값
```python
mx = -sys.maxsize
mn = sys.maxsize

mx = float('-inf')
mn = float('inf')
```
| 특징           | `sorted()`                    | `sort()`                  |
|----------------|-------------------------------|---------------------------|
| **사용 대상**  | 모든 반복 가능한 객체        | 리스트만                  |
| **반환값**     | 새로운 정렬된 리스트          | 없음                      |
| **원본 변경 여부** | 원본 변경 안 함                | 원본 리스트를 제자리에서 변경 |
| **사용 방법**  | 함수                         | 리스트 메서드             |

------------------
### 입력값
| N | Big(O) |
| --- | --- |
| N ≤ 11 | O(N!) |
| N ≤ 25 | O(2^N) |
| N ≤ 100 | O(N^4) |
| N ≤ 500 | O(N^3) |
| N ≤ 3,000 | O(N^2logN) |
| N ≤ 5,000 | O(N^2) |
| N ≤ 1,000,000 | O(NlogN) |
| N ≤ 10,000,000 | O(N) |
| 그 이상 | O(logN),O(1) |

------------------
### 재귀깊이설정
```python
import sys
sys.setrecursionlimit(10**7)
```
