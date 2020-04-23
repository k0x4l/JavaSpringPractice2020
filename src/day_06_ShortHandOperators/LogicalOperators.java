package day_06_ShortHandOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1);

        boolean result2 = !(10 + 15 > 15) ;
        System.out.println(result2);

        boolean result3 = !true == !false ;
        System.out.println(result3);


    }
}
