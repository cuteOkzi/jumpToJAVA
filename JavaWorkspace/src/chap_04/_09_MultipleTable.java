package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.println(String.format("%d * %d = %d", i, j, i * j));
            }
        }
    }
}
