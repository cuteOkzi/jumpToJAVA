package chap03;

public class _11_enum {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        System.out.println();

        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);
        }

        /*
            enum 활용방안
                - 매직넘버 사용시보다 코드 명확
                    매직넘버 : 하드코딩된 일정한 값을 의미하는 숫자나 문자열
                - 잘못된 값 사용해 생길 수 있는 오류 막기 가능
         */
    }
}
