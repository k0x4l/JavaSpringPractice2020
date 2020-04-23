package day03_VariablesContinue;

import java.util.Scanner;

public class SalaryCalculator {

    /*
    *
    * if rate = 55;
    * stateTaxRate = 0.04;
    * federalTaxRate = 0.22;
    * weeklyHours = 40;
    *
    * the output will be:
    *
    *   your salary is :
    *
    *  */

    public static void main(String[] args) {

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;

        double salary = weeklyHours * hourlyRate * totalWeeks;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double income = salary - totalTax;

        System.out.println("Your salary is "+salary+" $.");
        System.out.println("Total tax you pay : "+totalTax+" $.");
        System.out.println("Your income : "+income+" $.");
    }
}
