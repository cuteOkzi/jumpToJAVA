package chap03;
import java.util.ArrayList;
import java.util.Arrays;

public class _05_List {
    public static void main(String[] args) {
        /*
            리스트 vs 배열
            - 리스트 : 크기 안 정해짐 = 자료형 개수가 계속 변하는 상황에 적합
                ex) ArrayList, Vector, LinkedList
            - 배열 : 크기 정해짐
         */

        //ArrayList
        //add : 요소값 추가
        ArrayList pitches = new ArrayList();
        System.out.println(pitches);
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0,"133");
        System.out.println(pitches);

        //get : 특정 인덱스 값 출력
        pitches.get(1); // 출력문이랑 같이 안 써주면 가져와도 모니터에 안나옴
        System.out.println(pitches.get(2));

        //size : ArrayList 요소 개수 리턴
        System.out.println(pitches.size());

        //contains : 리스트 안에 해당 항목 있는지 판별해 bool값으로 return
        System.out.println(pitches.contains("138")); // true
        System.out.println(pitches.contains(138));  // false : int String 등 자료형 구분함
        System.out.println(pitches.contains("111"));

        //remove(객체) : 삭제
        System.out.println(pitches);
        pitches.remove("138");
        System.out.println(pitches);

        //remove(인덱스) : 삭제
        pitches.remove(0);
        System.out.println(pitches);

        //Q. remove는 int로 이뤄진 배열에도 객체랑 인덱스 구분이 가능한가?
        ArrayList res = new ArrayList(Arrays.asList(4, 5, 3, 8, 2));
        System.out.println(res);
        System.out.println(res.remove(3));
        System.out.println(res);
        System.out.println(res.remove(2));
        System.out.println(res);
        // int로 이뤄진 배열에는 index값으로 우선 간주하고 삭제함

    }
}
