package chap01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "상암08";
        int remainingTime = 3;
        double remainingDistance = 1.2;

        System.out.println(String.format("%s번 버스\n" +
                "약 %d분 후 도착\n" +
                "남은 거리 %.1f km"
        , busNo, remainingTime, remainingDistance));

    }
}
