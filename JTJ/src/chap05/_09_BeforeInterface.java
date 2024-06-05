package chap05;

class Tiger extends Animal implements Barkable{
    public void bark(){
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Barkable{
    public void bark(){
        System.out.println("으르렁");
    }
}

class ZooKeeper{
    //메서드 명이 동일하므로 메서드 오버로딩
    //동물 종류가 많을수록 메서드 오버로딩은 엄청 길어짐 = 비효율 = 인터페이스 필요
    void feed(Tiger tiger){
        System.out.println("feed apple");
    }

    void feed(Lion lion){
        System.out.println("feed banana");
    }
}

public class _09_BeforeInterface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
