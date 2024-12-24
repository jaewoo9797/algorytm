# Queue

## Feature
Queue Interface : FIFO(First In First Out) 순서로 데이터를 저장하고 처리합니다.

목록 끝에 요소를 삽입하고, 목록 시작 부분에서 요소를 삭제하는 것으로 제한된 객체의 정렬된 목록입니다.

- 구현 클래스 : (스레드 안전 작업을 위해) `LinkedList`, `PriorityQueue`, `ArrayDeque`, `ConcurrentLinkedQueue`
- 사용 사례 : 일반적으로 애플리케이션에서 작업 스케줄링, 메시지 전달, 버퍼 관리에 사용됩니다.

## Method
- add : 큐의 뒤쪽에 요소를 추가한다. size가 가득 차면 예외를 throw한다.
- offer : 큐의 뒤에 요소를 추가한다. 큐가 가득 차면 false를 반환한다.
- remove : 큐의 앞에 있는 요소를 제거하고 반환한다. 큐가 비어있으면 예외를 throw 한다.
- poll : 큐의 앞에 있는 요소를 제거하고 반환한다. 큐가 비어있으면 null을 반환한다.
- element : 큐의 앞에 있는 요소를 제거하지 않고 반환한다. 큐가 비어있으면 예외를 throw 한다.
- peek : 큐의 앞에 있는 요소를 제거하지 않고 반환한다. 큐가 비어있으면 null 반환한다.
