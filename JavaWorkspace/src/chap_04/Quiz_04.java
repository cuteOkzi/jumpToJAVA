package chap_04;
import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        int max = 30000;
        double discount = 0.5;
        int hour = 4000;
        int total;

        Scanner sc = new Scanner(System.in);
        System.out.println("주차시간을 입력하세요. (ex. 4시간 / 5시간 30분 ...)");
        String time = sc.nextLine();
        System.out.println("본인의 차량이 경차 혹은 장애인 차량인가요? (ex. y / n)");
        String answer = sc.nextLine();

        //주차시간 시간이랑 분 나누기
        String[] timeArr = time.split("시간");
        if (timeArr.length == 2) {
            total = hour *= Integer.parseInt(timeArr[0]) + 1;
        } else total = hour *= Integer.parseInt(timeArr[0]);

        //일 최대 요금 안 넘게 조절
        if(total > max){
            total = max;
        }

        //할인금액 계산
        if(answer.equals("y")) {
            total = (int) (total * discount);
        }



        System.out.println(String.format("총 주차요금은 %d원입니다.", total));
    }
}
