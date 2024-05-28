package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int k = 1;
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
        System.out.println(k);
        System.out.println();

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
