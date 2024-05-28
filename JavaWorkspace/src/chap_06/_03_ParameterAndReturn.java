package chap_06;

public class _03_ParameterAndReturn {
    public static int getPower(int num){
        int res = num * num;
        return res;
    }

    public static int getPowerByExp(int num, int exp){
        int res = 1;
        for(int i = 0; i < exp; i++){
            res *= num;
        }
        return res;
    }

    public static void main(String[] args) {
        int retVal = getPower(2); // 2 * 2 = 4;
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);
    }
}
