package chap06;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class _04_FileWrite {
    public static void main(String[] args) throws IOException {
        // 콘솔이 아닌 파일로 출력하느 방법

        // ex1) FileOutputStream
        FileOutputStream output = new FileOutputStream("out.txt"); //mac 은 그냥 파일명만 적어주면 src 밑에 생김
        //FileOutputStream 은 OutputStream 클래스 상속받아서 byte 단위 처리
        //String 을 byte 배열로 바꿔주는 getBytes()메서드 이용해야 함 = 불편
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        output.close(); // 파일 객체를 닫아주기 위한 코드

        // ex2) FileWriter
        // byte 단위 처리 아니라서 getBytes() 메서드 안 써줘도 됨
        FileWriter fw = new FileWriter("out2.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();


        // ex3) PrintWriter
        // 위에 두 예시는 한줄 띄우려면 \r\n을 문자열 뒤에 덧붙여야 했음
        PrintWriter pw = new PrintWriter("out3.txt");
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


        // 원래 있던 내용 전체 삭제하고 다른 내용이 들어감
        FileWriter fw2 = new FileWriter("out2.txt");
        for(int i = 11; i < 17; i++) {
            String data = i + "번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

        // 원래 내용에 내용 추가 (추가모드로 열기 = true / default값은 true)
        FileWriter fw3 = new FileWriter("out2.txt", true);
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            fw3.write(data);
        }
        fw3.close();

        // 내용추가
        PrintWriter pw2 = new PrintWriter(new FileWriter("out3.txt", true));
        for(int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }
}
