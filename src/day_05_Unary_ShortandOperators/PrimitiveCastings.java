package day_05_Unary_ShortandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        /*int a = 10;
        long b = a;

        System.out.println(b);*/

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (byte)Inum;

        double Dnum = 5.5 ;

        float Fnum = (float)Dnum ;

        System.out.println(Dnum);

        double D1 = 10.5 ;

        long L1 = (long) ( (float)D1);

        float F1 = 60.6f;

        int I1 = (int) F1;

        System.out.println(I1);

        long largeNum = 9999999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum);

        char ch1 = 'a';

        short sh1 = (short) ch1;
        System.out.println(sh1);

        char ch2 = 23456 ;

        double dbl1 = ch2;

        System.out.println(dbl1);

        int z1 = 10;

        double t1b = z1;

        short y1 = (short) z1;

        System.out.println(y1);

    }
}
