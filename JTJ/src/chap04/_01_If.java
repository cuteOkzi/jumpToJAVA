package chap04;
import java.util.ArrayList;
import java.util.Arrays;

public class _01_If {
    public static void main(String[] args) {
        boolean b1 = true;
        if (b1) {
            System.out.println("택시 타기");
        }else{
            System.out.println("걷기");
        }

        int x = 3;
        int y = 2;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);

        int money = 2000;
        if(money >= 3000){
            System.out.println("택시");
        }else{
            System.out.println("걷기");
        }

        // and: && , or: ||, not: !
        boolean hasCard = true;
        if((money >= 3000) || hasCard){
            System.out.println("택시");
        }else{
            System.out.println("걷기");
        }

        // contains : List자료형에 해당 아이템이 있는지 여부 (bool return)
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList("tissue", "cellphone", "money"));

        if(pocket.contains("money")){
            System.out.println("택시");
        }else{
            System.out.println("걷기");
        }

        System.out.println("hasCard : " + hasCard);
        pocket.remove("money");
        System.out.println(pocket);

        if((pocket.contains("money")) || hasCard){
            System.out.println("택시");
        }else{
            System.out.println("걷기");
        }

        //else if 문 활용 -> 보통 잘 안 씀
        if(pocket.contains("money")) {
            System.out.println("택시");
        }else if(hasCard) {
            System.out.println("택시");
        }else{
            System.out.println("걷기");
        }
    }
}
