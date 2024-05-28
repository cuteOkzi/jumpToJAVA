package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // 매일 20마리만 치킨 판매 (1인당 1마리만 구매 가능)
        // 손님 50명 대기

        int max = 20;
        for (int i = 1; i <= 50; i++) {
            if(i > max){
                System.out.println("금일 재료가 모두 소진되었습니다");
                System.out.println("영업을 종료합니다.");
                break;
            }
            System.out.println(i + "번째 손님 주문하신 치킨 나왔습니다");
        }
    }
}
