package chap05;

public class _03_Method {
    int i;

    // 입력 o 출력 o
    int sum(int a, int b) {
        return a + b;
    }

    // 입력 x 출력 o
    String say(){
        return "Hi";
    }

    // 입력 o 출력 x
    void sum2(int a, int b){
        System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다.");
    }

    // 입력 x 출력 x
    void say2(){
        System.out.println("Hi");
    }

    void sayNick(String nick){
        if("바보".equals(nick)){
            return;
        }
        System.out.println("나의 별명은 " + nick + "입니다.");
    }

    void varTest(int a){
        a++;
    }

    int varTest2(int a){
        a++;
        return a;
    }

    void varTest3(_03_Method M){
        M.i++;
    }

    void varTest4(){
        this.i++;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        _03_Method sample = new _03_Method();
        int c = sample.sum(a, b);
        System.out.println(c);

        /*
            1. 입력 o 출력 o 메서드
            2. 입력 x 출력 o 메서드
            3. 입력 o 출력 x 메서드
            4. 입력 x 출력 x 메서드
         */

        System.out.println(sample.say());
        sample.sum2(a, b);
        sample.say2();
        sample.sayNick("야호");
        sample.sayNick("바보"); // 출력 x = return 만나서 메서드 빠져나감

        System.out.println(a); // 3
        sample.varTest(a);
        System.out.println(a); // 3 : 매개변수 a가 메서드 안에서만 쓰이기 때문에 main문 안의 a 에 영향 x

        sample.varTest2(a);
        System.out.println(a); // 3

        a = sample.varTest2(a);
        System.out.println(a); //4

        sample.i = 1;
        sample.varTest3(sample);
        System.out.println(sample.i);

        sample.varTest4();
        System.out.println(sample.i);
    }
}
