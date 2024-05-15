package chap03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열 길이출력
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("JAVA")); // false = 완전 같아야 true 뜸

        System.out.println(s.indexOf("Java")); // 7 Java가 위치하는 [7:10] 에서 앞머리
        System.out.println(s.indexOf("C#")); // -1 스트링에 포함 안됨
        System.out.println(s.indexOf("and")); // 12 여러 and 중 첫번째 and의 a 위치
        System.out.println(s.lastIndexOf("and")); // 23 마지막 and의 a 위치
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.startsWith("I Like")); // false 대소문자 구분 필요
        System.out.println(s.endsWith("C.")); // true
    }
}
