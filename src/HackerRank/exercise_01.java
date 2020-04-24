package HackerRank;

import java.util.Scanner;

import static java.lang.Math.pow;

public class exercise_01 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();*/

        int a = 5;
        //int sonuc = a;
        int b = 3;

        for (int i=0;i<5;i++){

            a +=  +(int)Math.pow(2,i)*b;
            System.out.print(a+" ");
        }


    }
}
