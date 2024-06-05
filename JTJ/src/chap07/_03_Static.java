package chap07;

public class _03_Static {
    public static void main(String[] args) {
        /*
        static 활용 이유

        1) 메모리 낭비 줄이기
        HouseLee 클래스의 객체의 모든 lastname 은 '이' 여야 함
        static 안 붙이면 객체마다 객체변수인 lastname을 만들어서 메모리 별도 할당
        static 붙이면 메모리 낭비 줄이기 가능

        cf. static 앞에 final 붙여주면 값 변경 불가능

        2) 값 공유 가능
        같은 메모리 주소만 바라봄


        static 활용 예시
        - 유틸리티성 메서드 작성 시 많이 사용
            유틸리티성 메서드 : 특정 클래스나 인스턴스에 종속되지 않고,
            재사용이 가능하고 범용 기능을 제공하는 스태틱 메서드
            코드 중복 줄이고 가독성 향상 함
        ex) 오늘 날짜 구하기, 숫자에 콤마 추가하기
     */
    }
}
