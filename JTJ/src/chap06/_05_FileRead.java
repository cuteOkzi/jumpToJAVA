package chap06;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class _05_FileRead {
    public static void main(String[] args) throws IOException {
        //파일 읽기

        // ex1) FileInputStream
        // byte배열이 필요해서 데이터 길이 모를 경우 불편할 수 있음
        byte[] b = new byte[500];   // 500 바이트까지 받도록 되어있어서 공백이 나올 수 있음
        FileInputStream input = new FileInputStream("out.txt");
        input.read(b);
        System.out.println(new String(b)); // byte배열을 문자열로 변경해 출력
        input.close();

        // ex2) FileReader, BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while(true){
            String s = br.readLine();
            if(s == null) break;
            System.out.println(s);
        }
        br.close();
    }
}


