package chap_06;

public class _01_Method {
    //메소드는 주로 동사 소문자로 시작
    public static void sayHello(){
        System.out.println("Hello, I'm Method!");
    }

    public static void main(String[] args) {
        //메소드 = 함수
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
