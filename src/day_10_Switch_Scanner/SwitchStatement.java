package day_10_Switch_Scanner;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case  4:
                System.out.println("Four");
                break;

            default:
                System.out.println("Invalid case");
                break;

        }
    }
}
