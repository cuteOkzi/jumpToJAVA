package chap02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;

        System.out.println(t1 && t2); // true
        System.out.println(f1 && f2); // false
        System.out.println(t1 || t2); // true
        System.out.println(f1 || t2); // true

        System.out.println((5 > 3) && (3 > 1)); // true = true && true

        /*
            좋지 못한 코드 ex
                System.out.println(1 < 3 && 3 < 5);
                3 && 3 계산 가능
         */

        //논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
