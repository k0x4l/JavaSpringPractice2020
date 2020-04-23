package day_14_StringClass;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println(name.lastIndexOf("veli"));
        System.out.println(name.indexOf("veli"));

    }
}
