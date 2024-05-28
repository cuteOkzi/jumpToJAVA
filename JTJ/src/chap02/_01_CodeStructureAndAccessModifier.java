package chap02;

public class _01_CodeStructureAndAccessModifier {
    /*
        //클래스 블록
        public class 클래스명 {
            //메서드 블록
            [public | default | private | protected] [static] return자료형 메서드명 (매개변수자료형 매개변수, ...){
                명령문
            }
            ...
        }

        - 메서드 접근 제어자 (private < default < protected < public 순으로 많은 접근 허용)
            메서드 접근 제어자는 변수나 메서드 앞에 붙는다.
            private : 해당 클래스 안에서만 접근 가능
            default : 접근제어자 별도 설정 안하면 default 자동 설정 동일 패키지 내에서 접근 가능
            protected : 동일 패키지 클래스 또는 해당 클래스 상속받은 클래스 에서만 접근 가능
            public : 어떤 클래스에서든 접근 가능

     */

    /* private 접근 제어자 예시
        public class Sample{
            private String secret;
            private String getSecret(){
                return this.secret;
            }
        }

        secret 변수랑 getSecret 메서드는 오직 Sample 클래스에서만 접근 가능
    */

    /* default 접근제어자 예시
        [chap01/HouseKim.java 파일]
        package chap01;
        public class HouseKim{
            String lastname = "kim";    // 접근제어자 설정 안함 = default
        }

        [chap01/HousePark.java 파일]
        package chap01;
        public class HousePark{
            String lastname = "park";

            public static void main(String[] args){
                HouseKim kim = new HouseKim();
                System.out.println(kim.lastname);
                // 동일 패키지 내라서 HouseKim 클래스의 lastname 변수 사용 가능
            }
        }
     */

    /* protected 접근제어자 예시
        [chap01/HouseKi.java 파일]
        package chap01;
        public class HouseKi{
            protected String lastname = "ki";
        }

        [chap01/person/SeoYeonKi.java 파일]
        package chap01.person;  // 서로 다른 패키지
        public class SeoYeonKi extends HouseKi{ // HouseKi 상속함
            public static void main(String[] args){
                SeoYeonKi syk = new SeoYeonKi();
                System.out.println(syk.lastname);  // 상속 클래스 protected 변수 접근 가능
     */

    /*
        package house;
        public class HousePark{
            protected String lastname = "park";
            public String info = "this is public message."; // public 접근 제어자라서
        }

        import house.HousePark;
        public class Sample {
            public static void main(String[] args){
                HousePark housePark = new HousePark();
                System.out.println(housePark.info); // 패키지 달라도 언제든지 가져다 쓸 수 있음
            }
        }
     */



}
