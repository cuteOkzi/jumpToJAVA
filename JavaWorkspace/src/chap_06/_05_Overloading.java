package chap_06;

public class _05_Overloading {
    public static int getPower(int num){
        int res = num * num;
        return res;
    }
    //메소드 오버로딩 : 이름은 같지만 파라미터의 1)타입이나 2)개수를 다르게 해 여러번 정의 (다형성 제공)
    //1) 파라미터 타입이 다른 경우
    public static int getPower(String strNum){
        int res = Integer.parseInt(strNum) * Integer.parseInt(strNum);
        return res;
    }
    //2) 파라미터 개수가 다른 경우
    public static int getPower(int num, int exp){
        int res = 1;
        for(int i = 0; i < exp; i++){
            res *= num;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getPower(3)); // 9
        System.out.println(getPower("4")); // 16
        System.out.println(getPower(3, 3)); // 27
    }
}
