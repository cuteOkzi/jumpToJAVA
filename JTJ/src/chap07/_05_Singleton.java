package chap07;

class Singleton{
    private static Singleton one;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
    }
}

public class _05_Singleton {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
        // 컴파일 오류 : private 접근제어자로 다른 클래스에서 생성자 접근 불가능

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
