package day_23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("What is your age?");
        int yas = scan.nextInt();
        EligibleToBuyAlcohol(yas);
    }
    public static void EligibleToBuyAlcohol(int age){

        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }

}
