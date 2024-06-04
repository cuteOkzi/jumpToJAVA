package chap03;
import java.util.Arrays;

public class _04_Array {
    public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i = 0; i < weeks.length; i++) {
            System.out.printf(weeks[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(weeks));

        //System.out.println(weeks[7]); "ArrayIndexOutOfBoundsException" : 배열 인덱스 범위를 벗어남
    }
}
