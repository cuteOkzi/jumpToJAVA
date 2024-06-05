package house;

public class HousePark {
    protected String lastname = "park";
    // protected : 동일 패키지 클래스 혹은 해당 클래스를 상속받은 클래스에서만 접근 가능
    public String info = "this is public message.";

    public static void main(String[] args){
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
        // HouseKim 과 동일 패키지고
        // HouseKim 의 lastname 변수가 default 접근제어자이므로접근 가능함
    }
}
