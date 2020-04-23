package day_08_IfStatements;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int y = scan.nextInt();

        String z = (y<5) ? "smaller than 5" : "not smaller than 5";

        System.out.println(z);
    }

}
