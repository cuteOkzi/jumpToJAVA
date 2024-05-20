package chap03;

public class Quiz_03 {
    public static void main(String[] args) {
        String ID = "901231-1234567";

        if(ID.charAt(7) == '3' || ID.charAt(7) == '1'){
            System.out.println("남자입니다.");
            System.out.println(ID.substring(0,8));
        }else{
            System.out.println("여자입니다.");
            System.out.println(ID.substring(0,8));
        }
    }
}
