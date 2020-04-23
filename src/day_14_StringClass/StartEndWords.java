package day_14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.next();

        System.out.println("Enter second word: ");
        String word2 = scan.next();

        int length1 = word1.length();
        int length2 = word2.length();

        boolean same5length = length1 == 5 && length2 == 5 ;

        if (same5length){
            if (word2.charAt( length2-1 ) == word1.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        } else {
            System.out.println("Both of them must have 5 characters");
        }



    }
}
