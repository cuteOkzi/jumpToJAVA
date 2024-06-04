package chap03;
import java.util.Arrays;

public class _02_String {
    public static void main(String[] args) {
        // 리터럴 표기 방식 = 문자열 같으면 기존 String 정보 저장
        // 가독성 최고 + 컴파일 최적화 도움
        String happy = "Happy Seoyeon";
        // new 키워드 사용 방식 = 새로운 String 객체 생성
        String sad = new String("Sad Seoyeon");

        //문자열 내장메서드
        // equals VS ==
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");

        /*
            equals : 내용 비교 (같은 내용인지)
            == : 주소값 비교 (같은 객체인지)
        */
        System.out.println("a.equals(b) :" + a.equals(b));
        System.out.println("a.equals(c) :" + a.equals(c));
        System.out.println("a == c :" + (a == c));
        System.out.println("a.equals(d) :" + a.equals(d));
        System.out.println("a == d :" + (a == d));

        //str.indexOf(str) : String 내 특정 문자열 시작위치 return = int
        //str.lastIndexOf(str) : String 내 특정 문자열의 마지막 시작위치 return
        System.out.println(happy.indexOf("yeon"));
        System.out.println(happy.indexOf("y")); // Happy의 y 위치 return
        System.out.println(happy.lastIndexOf("y")); // Seoyeon 의 y 위치 return

        //str.contains(str) : 특정 문자열 포함 여부 return = boolean
        System.out.println(happy.contains("happy")); // false (대소문자 구분)
        System.out.println(happy.contains("Happy"));

        //str.charAt(index) : 문자열 특정 위치 문자 return = char
        System.out.println(sad.charAt(3));  // 공백 출력 o
        System.out.println(sad.charAt(2));

        //str.replaceAll(str(바꿀문자), str(바뀔문자)) : 특정 문자열 다른 문자열로 바꾸기
        System.out.println(sad.replaceAll("Seoyeon","떠여니"));
        System.out.println(sad);
        sad.replaceAll("Seoyeon", "떠여니");
        System.out.println(sad);

        // replaceAll 하고 값에 저장해둬야 영구적으로 바뀜
        sad = sad.replaceAll("Seoyeon", "떠여니");
        System.out.println(sad);

        // 여러개도 대체 됨
        sad = "sad sad seoyeon sad";
        System.out.println(sad.replaceAll("sad", "happy"));

        //str.substring(a, b) : 문자열에서 특정 문자열 뽑아내기
        //substring(a, b) : a <= 출력범위 < b (b미만인게 포인트)
        System.out.println(sad.substring(0,3));
        System.out.println(sad.substring(0,2));

        //str.toUpperCase() : 문자열 모두 대문자로 변경
        System.out.println(sad);
        System.out.println(sad.toUpperCase());

        //str.split(separator) : 구분자로 나누어 문자열 배열로 return
        a = "a:b:c:d:e";
        String[] res = a.split(":");
        //문자열 배열은 sout 시 메모리주소값 출력
        System.out.println(res);

        // 1. java.util.Arrays에 있는 Arrays.toString 메서드 사용
        System.out.println(Arrays.toString(res));
        // 2. 반복문 사용
        System.out.printf("[");
        for (int i = 0; i < res.length; i++) {
            System.out.printf(res[i]);
            if(i == res.length - 1)
                break;
            System.out.printf(", ");
        }
        System.out.println("]");

        // 문자열 포매팅
        System.out.println(String.format("I eat %d apples.", 3));
        System.out.println(String.format("I eat %s apples.", "three"));

        int num = 3;
        String day = "three";
        System.out.println(String.format("I eat %d apples.", num));
        System.out.println(String.format("I ate %d apples. so I was sick for %s days", num, day));

        /*
            문자열 포맷코드 종류
            %s : 문자열 / %c : 문자 한개 / %d : 정수
            %f : 부동소수 / %o : 8진수 / %x : 16진수
            %% : literal %
         */

        // %%
        //System.out.println(String.format("Error is %d%.", 98)); "UnknwonFormatConversionException 오류"
        System.out.println(String.format("Error is %d%%", 98));

        // 문자열 오른쪽 정렬
        System.out.println(String.format("%10s", "hi")); // 오른쪽부터 글 시작
        System.out.println(String.format("%10s", "hiii"));

        // 문자열 왼쪽 정렬
        System.out.println(String.format("%-10sjane.", "hi")); // hi 포함 10개길이 후 jane출력

        // 소수점 표현
        System.out.println(String.format("%.4f", 3.42134234));
        System.out.println(String.format("%10.4f", 3.42134234)); //3.4213 포함 10칸

        //printf
        System.out.printf("I eat %d apples", 3);

        /*
            String.format : 문자열 return 메서드
            System.out.printf : 문자열 출력 메서드
         */
    }
}
