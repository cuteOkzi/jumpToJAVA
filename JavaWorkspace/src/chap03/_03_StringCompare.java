package chap03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals("Python"));
        System.out.println(s1.equalsIgnoreCase("JAVa"));

        //문자열 비교 심화
        // 1234라는 값을 저장하고 있는 s1 을 s2도 같이 가리킴
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s2 = "1234 ";
        System.out.println(s1.equals(s2));  // false 공백 인식함
        System.out.println(s1 == s2); // false

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        /*
            자바 equals VS ==
            euqals : 객체 내용 비교 후 같은지 확인하는 메서드
            == : 객체 주소 비교 후 같은지 확인하는 메서드

            리터럴 방식 : s1과 s2에 같은 내용 넣으면 s2가 s1의 주소를 재활용함
            new 연산자 방식 : s1과 s2에 같은 내용을 넣더라도 각기 새로운 객체를 생성함
                > s1 == s2에 false 가 나오는 것
         */
    }
}
