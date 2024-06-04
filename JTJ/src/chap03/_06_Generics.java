package chap03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _06_Generics {
    public static void main(String[] args) {
        /*
            generics :자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류 줄이기 가능
            ex)
                일반방식 : ArrayList<String> pitches = new ArrayList<String>();
                선호방식 : ArrayList<String> pitches = new ArrayList<>();
                앞 자료형만 명시


            generics 도입 전
            ArrayList pitches = new ArrayList();
         */

        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");

        String one = pitches.get(0);
        String two = pitches.get(1);
        System.out.println(one + " " + two);

        // pitches.add(123); "imcompatible type" : int 자료형은 넣을 수 없음

        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("132", "128", "172", "143"));
        System.out.println(pitches2);


        // String.join(구분자, 리스트객체) : 리스트 각 요소에 구분자 넣어 하나의 문자열로 출력
        String res = "";
        for (int i = 0; i < pitches2.size(); i++) {
            res += pitches2.get(i);
            res += ", ";
        }
        res = res.substring(0, res.length()-2);
        System.out.println(res);

        res = "";
        System.out.println("res : " + res);
        res = String.join(", ", pitches2);
        System.out.println(res);


        // list 정렬 (오름차순)
        pitches2.sort(Comparator.naturalOrder());
        System.out.println(pitches2);

        // list 정렬 (내림차순)
        pitches2.sort(Comparator.reverseOrder());
        System.out.println(pitches2);
    }
}
