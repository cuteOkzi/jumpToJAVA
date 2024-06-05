package chap06;

public class _03_ConsoleOutput {
    public static void main(String[] args) {
        System.out.println("일반 출력"); // System.out은 PrintStream 클래스 객체
        System.err.println("에러 출력");

        /*
            이 java 소스를 컴파일해서 class 파일 생성하고 유닉스에서 실행하면
            out.txt 파일엔 일반 출력 이라는 문자열이 저장
            error.txt 파일엔 오류 출력 이라는 문자열 저장

            java _03_ConsoleOutput > out.txt 2> error.txt
         */

    }
}
