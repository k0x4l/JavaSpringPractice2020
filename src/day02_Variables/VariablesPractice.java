package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        double sumTaxes = federalTax + stateTax ;

        double salaryAfterTax = salary * (1 - sumTaxes);

        System.out.println(salaryAfterTax);

        System.out.println("================================================");

        double r = 5.5 ;

        double area = r * r * 3.14;

        System.out.println(area);

        System.out.println("=================================================");

        int kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("=================================================");

        double lira = 1000;
        double liraInDollar = lira / 6.15;
        System.out.println("1K Lira = "+liraInDollar+" Dollar");

        double rupi = 1000;
        double rupiInDollar = rupi * 0.014;
        System.out.println(rupiInDollar);

        System.out.println("=================================================");

        float f2 = 8.5f;

    }
}
