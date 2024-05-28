package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //치킨 주문 손님 중 노쇼 손님 있다고 가정
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i <= 50; i++) {
            if(i == noShow){
                System.out.println(i + "번 손님, 노쇼로 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            sold++;
            if (max == sold){
                System.out.println("금일 재료가 소진되었습니다. 감사합니다.");
                break;
            }
        }

        System.out.println("------------while----------------");

        int index = 1;
        sold = 0;
        while(index <= 50){
            if(index == noShow){
                System.out.println(index + "번 손님, 노쇼로 다음 손님에게 기회가 넘어갑니다.");
                index++;
                continue;
            }
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");

    }
}
