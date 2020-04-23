package day_14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String validUsername = "k0x4ll";
        String validPassword = "Qq.12345";

        System.out.println("Enter your username: ");
        String inputUsername = scan.nextLine();
        inputUsername = inputUsername.trim() ;

        System.out.println("Enter your password: ");
        String inputPassword = scan.nextLine();
        inputPassword = inputPassword.trim() ;

        boolean logedIn = inputPassword.equals(validPassword) && inputUsername.equals(validUsername) ;

        boolean isEmpty = inputPassword.isEmpty() || inputUsername.isEmpty() ;

        if(!isEmpty){

            if(logedIn){
                System.out.println("Log in Successfully");
            }else{
                System.out.println("You failed, try again");
            }

        }else{
            System.out.println("You MUST fill all information");
        }

    }
}
