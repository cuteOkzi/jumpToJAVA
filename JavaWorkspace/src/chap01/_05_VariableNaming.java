package chap01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /*
            1. 밑줄, 문자로 시작 가능
            2. 밑줄, 문자, 숫자 활용 가능
            3. 소문자로 시작 (카멜케이스)
            4. 예약어 사용 불가 (예약어 ex. public, static, void, main...)
        */

        //입국 신고서(여행)
        String nationality = "republic of korea";
        String firstName = "seoyeon";
        String lastName = "ki";
        String dateOfBirth = "1998-08-31";
        String residentialAddress = "budapest hotel"; // 체류지
        String purposeOfVisit = "tourism";
        String flightNo = "KE657"; // 항공편명
        String _flightNo = "KE657"; // 맡쥴사적
        String flight_no_2 = "KE657"; // 밑줄 숫자 포함

        int accompany = 2; // 동반자 수
        int lengthOfStay = 5; // 체류기간

        String item1 = "watch";
        String item2 = "backpack";

        // 상수(절대 변하지 않는 수)는 대문자로
        final String CODE = "KR";
        // CODE = "UK"; final 예약어 썼으므로 안 바뀜

    }
}
