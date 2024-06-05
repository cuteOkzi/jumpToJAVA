package chap05;

//IS-A 관계 : 상속관계 (자식 클래스 객체는 부모클래스 자료형처럼 사용 가능)
//Dog는 Animal에 포함됨 = IS-A관계
class Dog extends Animal{
    //자식 클래스 기능 확장
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

public class _05_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        // Dog객체를 Animal자료형으로 사용
        Animal dog2 = new Dog(); // 개로 만든 객체(Dog)는 동물(Animal)이다. (o)
        dog2.setName("dog");
        // dog2.sleep(); Animal 자료형이므로 sleep 못 씀

        // Animal객체를 Dog자료형으로 사용할 수 없음
        //Dog dog3 = new Animal(); // 동물로 만든 객체(Animal)는 개(Dog)이다. (x)


    }
}
