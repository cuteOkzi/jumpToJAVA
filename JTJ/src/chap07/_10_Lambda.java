package chap07;


// @FunctionalInterface 어노테이션 : 함수형 인터페이스임을 표시
// 2개 이상 메서드를 가진 인터페이스 작성 불가능
@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
    //Ca 인터페이스 메서드가 1개 이상이면 람다 사용 불가 (파라미터 몇개든 상관 x)
    //int mul(int a, int b);
    //int test(int a, int b, int c);
}

class MyCal implements Calculator{
    public int sum(int a, int b) {
        return a + b;
    }

    /*
        public int test(int a, int b, int c){
            return a;
        }
    */
}

public class _10_Lambda {
    public static void main(String[] args) {
        //1) lambda 적용 x
        MyCal mc = new MyCal();
        int res = mc.sum(3, 4);
        System.out.println(res);

        //2) lambda 적용 o
        Calculator mc2 = (int a, int b) -> a + b; // MyCal이라는 클래스 없이도 Cal객체 생성 가능
        int res2 = mc2.sum(1, 4);
        System.out.println(res2);

        //3) lambda 더 축약하기
        Calculator mc3 = Integer::sum;
        int res3 = mc3.sum(2, 7);
        System.out.println(res3);
    }
}
