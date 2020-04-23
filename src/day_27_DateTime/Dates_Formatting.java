package day_27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMMM_dd_yyyy"); //yyyy/MM/dd

        System.out.println(date1.format(dtf));
        System.out.println(date1.format(dtf));
        System.out.println("Hello GitHub");
    }
}
