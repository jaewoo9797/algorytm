# 백준 1966번 프린터 큐

[백준 1966번 프린터 큐 바로가기](https://www.acmicpc.net/problem/1966)

막히는 부분

- 큐에 요소를 삽입한 후에 우선순위에 맞게 출력 순서를 정하는 방법을 구현

```text
4 2
1 2 3 4
```

우선순위를 함께 저장한다.

```text
que = [0, 1],[1, 2],[2, 3],[3, 4] (index, priority)
```

이 중에 M(2) 번째에 있는 인덱스의 문서를 출력할 때 몇 번째로 출력을 하는지 묻는다.

큐에 우선순위 순서대로 출력하려면

먼저 우선순위가 가장 높은 4를 출력하기 위해서
```text
[3, 4], [0, 1], [1, 2], [2, 3]
```
다음 처럼 poll offer 한 후 
가장 높은 우선순위 큐를 먼저 빼면서 count를 하나 높인다.

현재 count : 2

원하는 것은 index가 2인 요소를 몇 번째로 출력하는 것인지 임으로 다음과 같이 poll offer 해준다.
```text
[2, 3], [0, 1], [1, 2]
```

poll 해주면서 count를 하나 더해주면서 M과 인덱스값이 같은지 검사한다.
```text
if ( current[0] == m ) {
    return count;
}

```