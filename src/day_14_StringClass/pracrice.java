package day_14_StringClass;

import java.util.Scanner;

public class pracrice {
    public static void main(String[] args) {
        String webAddress = "Www.amazon.com"    ;
        webAddress = webAddress.toLowerCase();

        if ( webAddress.startsWith("www.")){

            System.out.println("valid");

        }

        String email = "CybertekSchool@Yahoo.com";

        if ( email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your WebSite name: ");
        String webSite = scan.nextLine();

        webSite = webSite.toLowerCase();

        if(webSite.startsWith("www.")&&(webSite.endsWith(".com")||webSite.endsWith(".edu")||webSite.endsWith(".net")||webSite.endsWith(".gov"))){

            System.out.println("WebSite is OK");

        }else {
            System.out.println("WebSite is NOT valid");
        }



    }
}












