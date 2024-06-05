package chap05;

//추상메서드만 잔뜩 있는 인터페이스
interface human{
    abstract public void eat(String food);
    abstract public void love(String who);
}

// 추상클래스 : 인터페이스 역할 + 클래스 기능
// 인스턴스화 불가능 = 객체생성 불가능
// 여러 타입 관리하기 위한 상위타입으로서의 역할만 있음
// 추상클래스를 상속받은 클래스는 추상 클래스 내에 모든 추상 메서드 구현해야 함
abstract class Predator2  extends Animal {
    // 추상메서드 : 인터페이스의 메서드 역할 하는 메서드에도 abstract붙여야 함
    // 줄괄호를 없앰 = 정의하지 않겠다.
    abstract String getFood();

    //일반메서드
    void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }
}

public class _12_AbstractClass {
    public static void main(String[] args) {
        // Predator2 p = new Predator2(); "is abstract cannot be instantiated" 추상클래스라 인스턴스화 안됨
    }
}

/*
    인터페이스 vs 추상클래스
    - 인터페이스 : 모조리 추상메서드
        > 컨셉 : 전체적인 설계도 (규칙정하기)
    - 추상클래스 : 추상메서드 + 일반메서드
        > 컨셉 : 상속을 받아서 기능 확장
 */
