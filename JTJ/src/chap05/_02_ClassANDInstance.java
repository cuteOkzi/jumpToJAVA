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
