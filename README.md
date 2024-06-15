# coding-test
This is an auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).

- [입력 시간 줄이는 꿀팁](#입력시간줄이기)
- [리스트, 딕셔너리 주요 시간복잡도 차이](#boj7785)

### 입력시간줄이기
```python
import sys
input = sys.stdin.readline

...

a = input()
```

### [boj7785](https://github.com/2eungwoo/coding-test/tree/main/%EB%B0%B1%EC%A4%80/Silver/7785.%E2%80%85%ED%9A%8C%EC%82%AC%EC%97%90%E2%80%85%EC%9E%88%EB%8A%94%E2%80%85%EC%82%AC%EB%9E%8C)
list 쓰면 시간초과 나서 dictionary 쓴 문제
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

