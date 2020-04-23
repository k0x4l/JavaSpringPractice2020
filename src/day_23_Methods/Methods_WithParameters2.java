package day_23_Methods;

import java.util.Scanner;

public class Methods_WithParameters2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the word: ");
        String str = scan.next();
        ReverseString(str);
    }
    public static void ReverseString(String str){

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
