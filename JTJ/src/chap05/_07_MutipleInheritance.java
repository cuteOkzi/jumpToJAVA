package chap05;
class A {
    public void msg(){
        System.out.println("A message");
    }
}

class B {
    public void msg() {
        System.out.println("B message");
    }
}

// 자바는 다중상속을 지원하지 않는다.
// 다중상속 시 A클래스의 msg메서드 실행이냐 B클래스의 msg메서드 실행이냐의 불명확한 부분이 생김
// 파이썬은 다중상속 지원하는데 동일 메서드 상속 시 우선순위 정하는 규칙이 있음
public class _07_MutipleInheritance extends A {
    public static void main(String[] args) {
        _07_MutipleInheritance test = new _07_MutipleInheritance();
        test.msg();
    }
}
