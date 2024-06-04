package chap04;

public class _04_For {
    public static void main(String[] args) {
        String[] num = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println();

        int[] score = {90, 25, 67, 45, 80};
        for (int i = 0; i < score.length; i++) {
            if(score[i] > 60) {
                System.out.println(String.format("%d번 학생은 합격입니다.", i+1));
                continue;
            }
            System.out.println(String.format("%d번 학생은 불합격입니다.", i+1));
        }
        System.out.println();

        //ex1
        for (int i = 0; i < score.length; i++) {
            if(score[i] > 60) {
                System.out.println(String.format("%d번 학생 축하합니다. 합격입니다.", i+1));
            }
        }
        System.out.println();

        //ex2
        for (int i = 0; i < score.length; i++) {
            if(score[i] < 60) {
                continue;
            }
            System.out.println(String.format("%d번 학생 축하합니다. 합격입니다.", i+1));
        }
        System.out.println();

        //이중for문
        for (int i = 2; i < 10 ; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
