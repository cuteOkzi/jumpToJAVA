package chap04;

public class _03_While {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;

        while(money > 0){
            money -= 10;
            System.out.println("돈 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + " 입니다.");
            if(coffee == 0){
                System.out.println("재료소진. 판매를 중지합니다");
                break;
            }
        }
        System.out.println("남은 돈 : " + money);

        int a = 0;
        while(a < 10){
            a++;
            if(a % 2 == 0){
                continue;
            }
            System.out.println(a);
        }
    }
}
