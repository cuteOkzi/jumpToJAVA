package chap01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        /*
            int score = 93 + 93.8;
            java: incompatible types: possible lossy conversion from double to int
            에러메시지 해석 : 93 + 93.8은 double형이어서 int형 변수인 score에 저장 시 데이터 손실이 있는 변환이다.
         */

        int score = 93;
        System.out.println(score);
        System.out.println((float) score);  //93.0
        System.out.println((double) score); //93.0

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int) score_f;
        System.out.println(score);

        score_d = 93 + 93.3; // 93은 알아서 double로 형변환 시켜서 계산함
        // int -> long -> float -> double (자동 형변환)
        // 역순이면 수동 형변환 해줘야 함
        System.out.println(score_d);

        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);

        int convertedScoreInt = (int) score_d;
        System.out.println(convertedScoreInt);

        //숫자를 문자열로 바꾸기 (String 클래스의 valueOf 메소드)
        String s1 = String.valueOf(93);
        System.out.println(s1 + 100); // 93100 = 93이 문자열화 된 걸 알 수 있음
        System.out.println(93 + 100); // 193

        //숫자를 문자열로 바꾸기 (Integer 클래스의 toString 메소드)
        String s2 = Integer.toString(93);
        System.out.println(s2 + 100); // 93100
        System.out.println(93 + 100); // 193

        /*
            문자 -> 숫자 형변환
            1. String.valueOf(숫자);
            2. 숫자타입.toString(숫자);
         */

        //문자를 숫자로 바꾸기
        int i = Integer.parseInt("93");
        System.out.println(i + 1); // 94 = 형변환 잘됐음

        double d = Double.parseDouble("93.3");
        System.out.println(d + 1); // 94.3 = 형변환 잘됐음

        /*
            int error = Integer.parseInt("자바");
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            Exception in thread "main" java.lang.NumberFormatException: For input string: "자바"
            에러 해석 : Integer.parseInt의 파라미터로 int가 아니라 string이 와서 에러
         */

    }
}
