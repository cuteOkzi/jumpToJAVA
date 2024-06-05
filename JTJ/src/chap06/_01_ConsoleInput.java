package chap06;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/*
    스트림
    - 파일 데이터 : 파일은 시작과 끝이 있는 데이터 스트림
    - HTTP 송수신데이터 : 브라우저가 요청하고 서버가 응답하는 HTTP형태의 데이터 스트림
    - 키보드 입력 : 사용자가 키보드로 입력하는 스트림
*/

public class _01_ConsoleInput {
    // throws IOException : InputStream으로부터 값 읽어들일 때 발생할 수 있는 예외처리를 뒤로 미룬 것
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // byte읽기
        InputStreamReader isr = new InputStreamReader(in); // char읽기
        BufferedReader br = new BufferedReader(isr); // String읽기

        // 1byte만 받기
        /*
            int a;
            a = in.read();  // read() 메서드는 1byte 만 읽음

            System.out.println(a);
         */

        // 3byte 받기
        /*
            byte[] b = new byte[3];
            in.read(b); // read메소드 문자열 배열 파라미터로 넣으면 문자열 배열에 저장함
            for(byte bb : b){
                System.out.println(bb);
            }
         */

        // char 배열로 받기
        /*
            char[] c = new char[3];
            isr.read(c);
            for(char cc : c){
                System.out.println(cc);
            }
         */

        // String으로 받기
        String s = br.readLine();
        System.out.println(s);
    }
}
