package chap03;

public class _09_JVM_GC {
    public static void main(String[] args) {
        /*
            GC(garbage collector) : JVM 메모리 중 heap 영역에서 사용하지 않는 객체 삭제해 관리하는 역할
                - stop-the-world : 메모리 관리되는 동안 java Application 이 멈추는 현상 (GC 스레드 제외 모든 스레드 멈춤)
                    = JVM 튜닝해서 stop-the-world 발생 시간 줄임
            GC 구조
                1) Young Generation
                    - Eden 1개 + Survivor 2개
                        Eden : 새롭게 생성된 객체 위치하는 공간
                        Survivor : 살아남은 객체를 age 값과 함께 관리하는 공간
                    - Minor GC
                        Young Generation 에서 발생
                        Eden 꽉 차면, GC 발생하면서 Mark & Sweep
                    - Mark & Sweep
                        unreachable object 제거
                        사용중인 객체는 survivor 영역으로 이동
                        Eden 영역 비움
                    - promotion
                        특정 age값을 넘어가면 Old Generation 으로 이동
                2) Old Generation
                    - Young 영역보다 커서 GC 발생 적고 제거시간 오래 걸림 = 객체 많이 가질 수 있음
                    - Major GC : Old 영역에서 발생하는 GC
                3) Permanent Generation
                    - java8 부터 사라지고 mataspace 영역으로 전환


            GC 동작순서
                1) Heap 영역에 존재하는 객체들 접근 가능한지 확인
                2) GC Root 에서부터 시작해서 참조값 따라가면서 접근 가능한 객체에 mark 과정 반복
                3) 접근할 수 없는 객체는 제거(sweep)대상이 되고 제거됨

            GC Root 가 될 수 있는 대상
                - JVM 메모리 Stack 영역 내 존재하는 참조변수
                - Method Area의 static 데이터
                - JNI에 의해 생성된 객체들
         */
    }
}
