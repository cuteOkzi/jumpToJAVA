package chap03;

public class _08_DataStructure {
    public static void main(String[] args) {
        /*
            1. Collection
                1) List : 순서 o + 중복 허용 + 늘어나기 가능
                    a.ArrayList : 배열 활용 리스트 (조회多)
                        - 장점 : 조회 빠름 = 배열특징으로 index 활용 접근 가능
                        - 단점 : 삽입/삭제 느림
                    b.LinkedList : node와 pointer 이용한 리스트 (삽입/삭제 多)
                        - next, prev 양방향 포인터 활용까되니
                        - 단점 : 조회 느림 = 특정 원소 순회 위해서 첫 노드부터 순회
                    c.Vector : 배열 활용 리스트
                        - Thread-Safe 동기화 지원 = 한번에 한 스레드만 접근 가능
                        - 멀티 스레드 환경에서 활용 가능
                        - get,put 모두에 동기화 있어서 스레드마다 lock = arraylist에 비해 성능 안좋음
                        - 멀티스레드 환경에서는 보통 vector보단 다음과 같은 자료구조 많이 씀
                            Collections.synchronizedList(new ArrayList<>());
                            Collections.synchronizedSet(new HashSet<>());
                            Collections.synchronizedMap(new HashMap<>());
                    d.Stack
                        - LIFO(Last in first out) : 마지막으로 들어온 게 처음으로 나감

                2) Set : 순서 x , 중복 허용 x
                    a.HashSet : 순서 x , 중복 허용 x
                    b.LinkedHashSet : 순서 o , 중복 허용 x (들어온 순으로 순서 가짐)
                    c.TreeSet: 순서 x , 중복 허용 x (데이터는 기본적으로 오름차순 정렬해서 저장)

                3) Queue : FIFO (first in first out) : 처음으로 들어온 게 처음으로 나감 (enqueue, dequeue)
                    a.priorityQueue : 원소에 우선순위 부여해 높은 순 반환
                    b.ArrayDeque : 양쪽으로 넣고 빼는 것이 가능한 큐

            2. Map : key-value 쌍으로 이뤄진 자료구조 (순서x, key는 중복 안되지만 value 중복 가능)
                1) HashMap
                2) LinkedHashMap : 들어온 순으로 순서 o
                3) HashTable : HashMap과 동일한 특징 + Thread-Safe 로 동기화 지원
                4) TreeMap : 이진트리로 구성 (TreeSet처럼 정렬해서 데이터 저장 = 저장 시간 오래걸림)


            immutable
                - immutable 은 변경 불가능 + 레퍼런스 타입이며 heap영역에 생성
                - ex) string, boolean, integer, float, long
         */
    }
}
