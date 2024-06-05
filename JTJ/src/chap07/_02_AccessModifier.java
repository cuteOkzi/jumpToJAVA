package chap07;

class Private{
    // 1) private : 이거 붙은 변수나 메서드는 해당 클래스 안에서만 접근 가능
    private String secret;
    private String getSecret(){
        return this.secret;
    }
}

public class _02_AccessModifier {
    public static void main(String[] args) {
        /*
            private < default < protected < public 순으로 많은 접근 허용

            접근제어자는 변수나 메서드에 모두 붙기 가능
            private : 해당 클래스 안에서만 접근 가능
            default : 동일 패키지 안에서만 접근 가능
            protected : 동일 패키지의 클래스 또는 해당 클래스 상속받은 클래스에서만 접근 가능
            public : 어떤 클래스에서도 접근 가능

            접근제어자 활용 이유
            - 프로그래머 실수 방지 가능
            - 기타 위험요소 제거 가능
        */
    }
}
