package chap05;


interface Barkable{
    void bark();
}

//인터페이스는 클래스와 달리 extends를 이용해 여러 인터페이스를 동시상속 가능함
interface BarkablePredator extends Predator, Barkable{

}

class Cat extends Animal implements BarkablePredator{
    public String getFood(){
        return "tuna";
    }
    public void bark(){
        System.out.println("냐용");
    }
}

class Bouncer{
    void barkAnimal(Animal animal){
        //instanceof : 어떤 객체가 특정 클래스의 객체인지 조사할 때 사용
        if(animal instanceof Crocodile){
            System.out.println("캬아악");
        } else if(animal instanceof Leopard){
            System.out.println("캬야야야아옹");
        }
    }

    // 다형성 : 하나의 객체가 여러 자료형 타입을 가질 수 있는 것
    // 입력 자료형을 Animal 에서 Barkable 인터페이스로 바꿈
    // 위 instanceof 분기문을 아래처럼 간단히 표현 가능함
    void bark(Barkable animal){
        animal.bark();
    }

}

public class _11_Polymorphism {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        Cat cat = new Cat();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(crocodile);
        bouncer.barkAnimal(leopard);

        bouncer.bark(tiger);
        bouncer.bark(lion);
        bouncer.bark(cat);
    }
}
