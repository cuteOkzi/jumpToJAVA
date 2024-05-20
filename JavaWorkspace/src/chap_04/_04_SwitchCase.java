package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /*
            석차에 따른 장학급 지급
            1등 : 전액
            2등 : 반액
            3등 : 반액
            그외 : 지급 대상 아님
         */

        int ranking = 1;
        if(ranking == 1){
            System.out.println("전액 장학금");
        }else if(ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #1");

        switch(ranking){
            case 1:
                System.out.println("전액장학급");
                break;
            case 2, 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 지급 대상 아님");
                break;
        }
        System.out.println("조회완료 #2");

        switch(ranking){
            case 1:
                System.out.println("전액장학급");
                break;
            case 2: case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 지급 대상 아님");
                break;
        }
        System.out.println("조회완료 #3");

        int grade = 4;
        int price = 7000;
        switch(grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price);
    }
}
