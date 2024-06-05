package house;

public class Counter2 {
    static int count = 0;
    Counter2(){
        count++;
        System.out.println(count);
    }

    //객체 생성 없이도 클래스 통해 메서드 직접 호출 가능
    //스태틱 메서드 안에서는 객체 접근이 불가능
    //but 이 예시에서 count 변수가 static 변수라서 static 메서드에서 접근 가능
    public static int getCount(){
        return count;
    }
}
