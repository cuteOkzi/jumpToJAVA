package chap_06;

public class _06_WhenToUse {
    public static int getPower(int num){
        return getPower(num, 2);
    }
    public static int getPower(int num, int exp){
        int res = 1;
        for(int i = 1; i <= exp; i++){
            res *= num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getPower(5, 3));
        System.out.println(getPower(3,3));
        System.out.println(getPower(3));
    }
}
