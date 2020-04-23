package day_15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Java" ;

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0) ;
        System.out.println(reverse1);

        String reverse2 = str.substring(0,2) + str.substring(0);
        System.out.println(reverse2);

    }
}
