package chap02;

import org.w3c.dom.ls.LSOutput;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height1 = 115;
        int height2 = 121;
        String boarding1 = (height1 >= 120) ? "가능" : "불가능";
        String boarding2 = (height2 >= 120) ? "가능" : "불가능";

        System.out.println(String.format(
                "키가 %dcm 이므로 탑승 %s합니다."
                , height1, boarding1));
        System.out.println(String.format(
                "키가 %dcm 이므로 탑승 %s합니다."
                , height2, boarding2));
    }
}
