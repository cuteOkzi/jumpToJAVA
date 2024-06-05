package chap05;

import java.util.zip.CheckedOutputStream;

class HouseDog extends Dog{
    HouseDog(){

    }
    //얘만 있으면 오류나는데 위에 디폴트 생성자 추가해주면 name입력 안 받아도 오류 안남
    HouseDog(String name){
        this.setName(name);
    }
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }
}

public class _06_OverRidingANDLoading {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep();
        /*
            sleep메서드가 Dog, HouseDog에 모두 있음
            가장 아래 자식의 메서드로 활용

            메서드 오버라이딩(method overriding)
            : 부모 클래스 메서드를 자식 클래스가 동일한 형태로 다시 구현
            = 메서드 덮어쓰기
         */

        houseDog.sleep(3);
        /*
            메서드 오버로딩(method overloading)
            : 동일한 이름에 입력파라미터가 다른 메서드
         */
    }
}
