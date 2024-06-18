# coding-test
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).

### [백준풀이피드백](#백준풀이피드백)
- [boj12345](#boj12345)

### [파이썬 익숙해지기](#Python)
- [입력](#입력)
- [출력](#출력)
- [입력 시간 줄이는 꿀팁](#입력시간줄이기)
- [리스트](#리스트)
  - [내장함수](#내장함수)
  - [내장메서드](#내장메서드) 
- [리스트, 딕셔너리 주요 시간복잡도 차이](#리스트vs딕셔너리)
- [list 초기 세팅](#배열초기화)
- [swap 쉽게하기](#swap쉽게하기)
- [pass,exit](#pass,exit)

# 백준풀이피드백
### boj12345

# Python
### 입력
```python
n = int(input())

n1, n2 = map(int, input().split())

list = list(map(int, input().split()))
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
------------------
### 입력시간줄이기
```python
import sys
input = sys.stdin.readline

...

a = input()
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
max(list
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
### 배열초기화 
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
    list[i] = i # error
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
------------------
### swap쉽게하기
```python
swap(a,b) 는
a,b = b,a 로 가능
```
------------------
### pass,exit
pass
```python
for i in range(1,5):
  if(i==3):
    pass
  print(i)

# 1 2 3 4 5
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
