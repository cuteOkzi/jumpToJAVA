package chap05;

//name 이라는 객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 생성자 만들어주기
class HouseDog2 extends HouseDog{
    //생성자 : 메서드명과 클래스명이 동일하고 리턴자료형을 정의하지 않는 메서드
    //객체 생성 시 호출된다 (=new키워드 사용 시 호출)
    HouseDog2(String name){
        this.setName(name);
    }
    //생성자 오버로딩 가능 (constructor overloading)
    HouseDog2(int type){
        if(type == 1){
            this.setName("Gureum");
        }else{
            this.setName("Haneul");
        }
    }
}

class Dog2 extends Animal{
    /*
        디폴트 생성자 : 생성자 입력항목과 내부 내용이 없는 생성자
        클래스 내에 생성자 없으면 컴파일러가 자동으로 이와 같은 디폴트 생성자 추가
        만약 생성자 하나라도 구현되어 있으면 따로 추가 안함
     */

    Dog2(){

    }

    void sleep(){
        System.out.println(this.name + " zzzz");
    }
}

public class _08_Constructor {
    public static void main(String[] args) {
        // HouseDog2 dog = new HouseDog2(); 생성자에서 name받으라고 하기 때문에 비어있으면 오류남
        HouseDog2 dog = new HouseDog2("happy");
        System.out.println(dog.name);

        Dog2 dog2 = new Dog2();
        System.out.println(dog2.name);

        HouseDog2 dog3 = new HouseDog2(1);
        System.out.println(dog3.name);

        HouseDog2 dog4 = new HouseDog2(2);
        System.out.println(dog4.name);
    }
}
