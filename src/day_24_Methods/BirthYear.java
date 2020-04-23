package day_24_Methods;

import java.util.Scanner;

public class BirthYear {
    public static void Age(int birthYear){
        int currentYear = 2020;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        birthYear = scan.nextInt();

        int age = currentYear- birthYear;

        if(birthYear < currentYear){
            System.out.println(age);
        }else{
            System.out.println("You are not born yet");
        }

    }

    public static void main(String[] args) {
        //Age(2000);
        printHelloCybertek();
    }

    public static void printHello(){
        System.out.print("Hello");
    }

    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek(){
        printHello();
        printCybertek();
    }

}
