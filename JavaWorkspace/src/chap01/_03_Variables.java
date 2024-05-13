package chap01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "기서연";
        int hour = 15;
        double score = 90.5;
        char grade = 'A';
        boolean pass = true;

        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");
        System.out.println(String.format("%s 님의 평균점수는 %.1f 입니다.", name, score));
        System.out.println("학점은 " + grade + "입니다.");
        System.out.println("이번 시험 합격여부 :" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);

        int i = 1000000000; // int 21억 초과 x
        long l = 1000000000000L;
        long l2 = 1_000_000_000_000L;
        System.out.println(l);
        System.out.println(l2);

    }
}
