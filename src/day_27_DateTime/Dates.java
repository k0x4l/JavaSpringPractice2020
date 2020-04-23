package day_27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10,21);
        System.out.println(date1);

        LocalDate birthDay = LocalDate.of(2010,4,25);
        System.out.println(birthDay);

        boolean result1 =date1.isAfter(birthDay);
        System.out.println(result1);

        boolean result2 = date1.isBefore(birthDay);
        System.out.println(result2);

        boolean result3 = date1.isEqual(birthDay);
        System.out.println(result3);

        boolean result4 =birthDay.isLeapYear();
        System.out.println(result4);

        LocalDate now = LocalDate.now();
        System.out.println("Today is now"+now);

        String str = now.toString();
        System.out.println(str.replace("-"," "));
    }
}
