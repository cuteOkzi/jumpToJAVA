package chap02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);  // 2 = 정수 몫
        System.out.println((double)5 / 2); // 2.5 = 실수 몫
        System.out.println(5 % 2);  // 나머지
        System.out.println(2 / 4); // 0

        System.out.println(2 + 2 * 2); // 6 = 곱셈 먼저 실행
        System.out.println((2 + 2) * 2); // 8

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        int val;
        val = 1;
        System.out.println(val++); // 1
        System.out.println(val); // 2

        System.out.println(--val); // 1
        System.out.println(val); // 1

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
