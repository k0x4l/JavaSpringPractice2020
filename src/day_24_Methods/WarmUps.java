package day_24_Methods;

import java.util.Scanner;

public class WarmUps {
    public static  void Max(int num1, int num2){

        /*   Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
    */

        if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }
    }

    public static void calculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Max(a,b);
        calculation(a,b,'*');

    }
}
