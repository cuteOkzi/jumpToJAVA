package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if(hallabongAde) {
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice) {
            System.out.println("망고주스 + 1");
        }else{
            System.out.println("아아메 + 1");
        }
        System.out.println("커피 주문 완료 #1");

        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if(hallabongAde) {
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice) {
            System.out.println("망고주스 + 1");
        }else if(orangeJuice){
            System.out.println("오렌지주스 + 1");
        } else{
            System.out.println("아아메 + 1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}
