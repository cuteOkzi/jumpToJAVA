package chap07;

import java.text.SimpleDateFormat;
import java.util.Date;

class Util{
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

public class _04_Date {
    public static void main(String[] args) {
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
