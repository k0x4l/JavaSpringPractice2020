package day_10_Switch_Scanner;

import java.util.Scanner;

public class ScanenerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");
        byte num2 = input.nextByte();

        System.out.println("The sum of "+num1+" and "+num2+" is: "+(num1+num2));

    }
}
