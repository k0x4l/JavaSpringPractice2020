package day_14_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.next();

        System.out.println("Enter second word: ");
        String word2 = scan.next();

        System.out.println("Enter third word: ");
        String word3 = scan.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean sameLength = length1 == length2 && length2 == length3 ;
        boolean allNotSame = length1 != length2  && length2 != length3 && length1 != length3 ;

        if (sameLength){
            System.out.println("All words are the same");
        }else if (allNotSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different length");
        }



    }
}
