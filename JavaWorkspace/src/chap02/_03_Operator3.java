package chap02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교연산자
        System.out.println(5 > 3); // true = boolean 자료형
        System.out.println(5 >= 3); // true
        System.out.println(5 < 3); // false
        System.out.println(5 <= 3); // false
        System.out.println(5 == 3); // false
        System.out.println(5 != 3); // true

        //삼항연산자
        System.out.println(5 > 3 ? "this is true" : "this is false"); // 조건문 ? 참일때 값 : 거짓일 때
    }
}
