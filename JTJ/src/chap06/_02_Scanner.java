package chap06;
import java.util.Scanner;

public class _02_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());  // 토큰 읽어들이기 가능
        System.out.println(sc.nextLine()); // 라인 읽어들이기 가능
        System.out.println(sc.nextInt()); // 정수 읽어들이기 가능
    }
}
