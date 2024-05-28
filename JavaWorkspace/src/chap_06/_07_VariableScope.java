package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        //System.out.println(num);
    }
    public static void methodB() {
        int res = 1;    // 지역변수
    }
    public static void main(String[] args) {
        int num = 3;    // 지역변수
        //System.out.println(res);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(num);
        }
        //System.out.println(j);
    }
}
