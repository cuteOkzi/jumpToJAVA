// 다른 클래스에서 사용하려면 import 필요
import house.HouseKim;
import house.HousePark;
// import house.*; 가능




public class Sample {
    public static void main(String[] args) {
        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();

        System.out.println(park.info);
    }
}
