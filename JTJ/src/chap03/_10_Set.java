package chap03;
import java.util.Arrays;
import java.util.HashSet;

public class _10_Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        // [e, H, l, o] : 집합은 순서도 없고 중복도 허용하지 않아서
        System.out.println(set);
        // 집합, 맵은 인덱싱으로 값을 얻을 수 없음

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        //교집합 retainAll()
        HashSet<Integer> intersection = new HashSet<>(s1);
        System.out.println("intersection :" + intersection);
        intersection.retainAll(s2);
        System.out.println("intersection :" + intersection);

        //합집합 addAll()
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("union :" + union);

        //차집합
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println("substract : " + substract);

        //add : 값 추가  / addAll : 값 여러개 추가
        System.out.println(set);
        set.add("Jump");
        System.out.println(set);

        set.addAll(Arrays.asList("to", "java"));
        System.out.println(set);

        //remove : 특정 값 제거 / removeAll : 값 여러개 제거
        set.remove("to");
        System.out.println(set);
        set.removeAll(Arrays.asList("java", "Jump"));
        System.out.println(set);
    }
}
