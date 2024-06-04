package chap03;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class _12_final {
    public static void main(String[] args) {
        //String -> int : Integer.parseInt()
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        //System.out.println(n instanceof int);

        // int -> String  : 앞에 빈 문자열 더해주기
        String num2 = "" + n;
        System.out.println(num2 + " " + num2.getClass());
        String num3 = String.valueOf(n);
        String num4 = Integer.toString(n);
        System.out.println(num3 + " " + num3.getClass());
        System.out.println(num4 + " " + num4.getClass());

        // String -> double, float
        String num5 = "123.456";
        double d = Double.parseDouble(num5);
        System.out.println(d);
        float f = Float.parseFloat(num5);
        System.out.println(f);

        //int -> double
        int n1 = 123;
        double d1 = n1;
        System.out.println(d1);

        //double -> int
        double d2 = 123.456;
        int n2 = (int) d2;
        System.out.println(n2);

        //float -> int
        float f1 = 123.345f;
        System.out.println(f1);
        int n3 = (int)f1;
        System.out.println(n3);

        String num6 = "123.456";
        // int n4 = Integer.parseInt(num6);
        // "NumberFormatException" : Double.parseDouble()로 실수로 바꾼 후 바꿔줘야 함

        //final : 값을 단 한번만 설정할 수 있게 해주는 키워드
        final int nn = 123;
        // n = 456; variable n is already defined in method : 컴파일 오류

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c","d")); "variable n is already defined in method" : 컴파일 오류

        //Unmodifiable List : add, remove 불가능한 리스트
        final List<String> aa = List.of("a","b");
        //aa.add("c"); "UnsupportedOperationException"
    }
}
