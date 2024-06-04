package chap04;
import java.util.Arrays;
import java.util.ArrayList;

public class _05_ForEach {
    public static void main(String[] args) {
        String[] num = {"one", "two", "three"};
        for (String n: num){
            System.out.println(n);
        }
        System.out.println();

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        for(String n: numbers){
            System.out.println(n);
        }
    }
}
