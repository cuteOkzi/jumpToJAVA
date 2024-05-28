package chap_06;

public class _03_Return {
    // 호텔 전화번호, 주소, 액티비티
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 은평구 ...";
    }

    public static String getActivities(){
        return "볼링장, 탁구장, 노래방 ...";
    }

    public static void main(String[] args) {
        String contactNum = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNum);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        String activities = getActivities();
        System.out.println("호텔 액티비티 : " + activities);
    }
}
