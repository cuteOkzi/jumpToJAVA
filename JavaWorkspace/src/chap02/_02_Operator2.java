package chap02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //복합 대입 연산자
        int num = 10;
        num += 2;
        System.out.println(num); // 12

        num -= 2;
        System.out.println(num); // 10

        num *= 10;
        System.out.println(num); // 100

        num /= 10;
        System.out.println(num); // 10

        num += 2; // 12
        num %= 10;
        System.out.println(num); // 2



    }
}
