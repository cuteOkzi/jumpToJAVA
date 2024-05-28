package chap_06;

public class _02_Parameter {
    public static int power(int a){
        return a * a;
    }

    public static void power2(int a){
        System.out.println(a * a);
    }

    public static void powerByExp(int num, int exp){
        int res = 1;
        for(int i = 0; i < exp; i++ ){
            res *= num;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        //전달값, parameter
        //제곱
        System.out.println(power(3));
        power2(3);

        /*
            1) power 함수는 a * a를 return 값으로 받음
            즉, power(a) = a * a 값으로 대체된다는 뜻
            화면에 출력하려면 sout문 써줘야 함

            2) power2 함수는 a * a 값을 화면에 출력하는 함수임
            즉, power2(a) 그자체로 화면에 출력하라는 뜻이므로
            따로 sout문을 본문에서 써줄 필요 x
         */
        powerByExp(10, 3);
    }
}
