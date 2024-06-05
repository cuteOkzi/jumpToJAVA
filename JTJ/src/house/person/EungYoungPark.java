package house.person;   // HousePark는 house패키지이므로 패키지 상이
import  house.HousePark;

public class EungYoungPark extends HousePark {
    public static void main(String[] args) {
        EungYoungPark e = new EungYoungPark();
        System.out.println(e.lastname);
        // 패키지는 상이하나, HousePark 상속받았으니까 변수 접근 가능
    }
}
