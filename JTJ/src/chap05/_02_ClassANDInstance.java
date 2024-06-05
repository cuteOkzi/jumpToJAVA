package chap05;

class Animal{
    String name; //this.name이 이걸 뜻함

    public void setName(String name){
        this.name = name; // name은 파라미터로 받은 name
    }
}

public class _02_ClassANDInstance {
    public static void main(String[] args) {
        //cat : Animal 클래스의 인스턴스
        Animal cat = new Animal();
        System.out.println(cat.name);

        cat.setName("nabi");
        System.out.println(cat.name);

        cat.name = "nya";
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("happy");
        System.out.println(dog.name);
    }
}

/*
    자바에서 만드는 모든 클래스는 Object클래스를 상속받는다.
    원래는 밑에처럼 표현되지만 위에 Animal 클래스 처럼 extends Object부분을 코딩하지 않아도
    자동으로 Object클래스를 상속받는 것

    class Animal extends Object {
        String name;

        void setName(String name){
            this.name = name;
        }
    }

    따라서, 다음과 같이 코딩하는 게 가능함
    Object animal = new Animal(); // Animal is a Object
    Object dog = new Dog(); // Dog is a Object

*/
