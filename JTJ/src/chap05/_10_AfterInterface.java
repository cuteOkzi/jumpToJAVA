package chap05;

// 인터페이스 활용해서 Zookeeper2 클래스가 동물클래스에 의존하다가 독립적인 클래스가 됨
interface Predator{
    String getFood();

    //디폴트 메서드 : 인터페이스를 구현한 클래스들은 printFood메서드 구현 안 해도 사용 가능함 (오버라이딩도 가능)
    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }
}

class Crocodile extends Animal implements Predator{
    //Predator 의 getFood 메서드 오버라이딩
    public String getFood(){
        return "apple";
    }
}

class Leopard extends Animal implements Predator{
    public String getFood(){
        return "banana";
    }

    //디폴트메소드 오버라이딩 가능
    public void printFood(){
        System.out.printf("leo's food is %s\n", getFood());
    }
}

class Zookeeper2 {
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
}

public class _10_AfterInterface {
    public static void main(String[] args) {
        Crocodile c = new Crocodile();
        Leopard l = new Leopard();
        Zookeeper2 z = new Zookeeper2();

        z.feed(c);
        z.feed(l);
        c.printFood();
        l.printFood();
    }
}
