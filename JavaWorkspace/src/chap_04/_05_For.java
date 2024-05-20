package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 손님이 들어오면
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");
        System.out.println("어서오세요, 나코입니다");
        // 인사법이 바뀌면
        System.out.println("환영합니다, 나코입니다");
        System.out.println("환영합니다, 나코입니다");
        System.out.println("환영합니다, 나코입니다");
        System.out.println("환영합니다, 나코입니다");
        // 매장 이름이 바뀌면
        System.out.println("환영합니다, 코나입니다");
        System.out.println("환영합니다, 코나입니다");
        System.out.println("환영합니다, 코나입니다");

        String hello = "안녕하세요";
        String storeName = "nako";

        for (int i = 0; i < 3; i++){
            System.out.println(String.format("%s, %s입니다.", hello, storeName));
        }
        System.out.println();

        //짝수만 출력
        for (int i = 0; i < 10; i+=2){
            System.out.printf(i + " ");
        }
        System.out.println();

        //홀수만 출력
        for (int i = 1; i < 10; i+=2){
            System.out.printf(i + " ");
        }
        System.out.println();

        //거꾸로 출력
        for(int i = 5; i > 0; i--){
            System.out.printf(i + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
