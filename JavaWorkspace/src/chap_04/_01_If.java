package chap_04;

import org.w3c.dom.ls.LSOutput;

public class _01_If {
    public static void main(String[] args) {
        int hour = 10;

        if(hour < 10)
            System.out.println("아이스 아메리카노 + 1");

        if(hour < 14){
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 10;
        boolean morningCoffee = false;
        if(hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        if(hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println();

        hour = 15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
