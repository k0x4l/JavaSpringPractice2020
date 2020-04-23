package day_05_Unary_ShortandOperators;

public class PostPre {

    public static void main(String[] args) {

        int a = 100;
        System.out.println(++a);

        System.out.println(a);

        int b = 100;
        System.out.println( --b );
        System.out.println(b);

        int c =100;
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(c);

        int x =4;
        int y = 4 * --x - x++;
        System.out.println(y);
        System.out.println(x);

    }

}
