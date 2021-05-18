package src.기본API;

import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH) + 1) + "월 " +
                now.get(Calendar.DAY_OF_MONTH) + "일");
    }
}
