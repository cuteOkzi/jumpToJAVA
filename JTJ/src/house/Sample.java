package house;

public class Sample {
    public static void main(String[] args) {
        //동일 패키지 내에서는 HouseKim을 import 하지 않아도 사용 가능함
        HouseKim kim = new HouseKim();

        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 1
        //c1, c2는 Counter가 count라는 변수를 static처리 안해줬기 때문에
        //증가된 결과가 나오지 않음 = 객체 변수가 항상 독립적인 값을 갖기 때문

        Counter2 c3 = new Counter2();
        Counter2 c4 = new Counter2();
        //Counter2에서는 static 처리 해줘서 증가 결과 나옴

        System.out.println(Counter2.getCount());
    }
}
