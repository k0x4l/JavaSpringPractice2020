package Repl_it;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE

        int Smartphone = 300;
        int Laptop = 400;
        int Charger = 15;
        int USBcable = 10;
        int Headphones = 30;
        int Pants = 50;
        int Hat = 25;
        int Socks = 5;
        int Blanket = 60;
        int Pillow = 40;
        int i=0, price = 0, balance, giftCard = 100;


        if ( item == "Smartphone" ) {
            price = Smartphone;
        }else if ( item == "Laptop") {
            price = Laptop;
        }else if ( item == "Charger") {
            price = Charger;
        }else if ( item == "USB cable") {
            price = USBcable;
        }else if ( item == "Headphones") {
            price = Headphones;
        }else if ( item == "Pants") {
            price = Pants;
        }else if ( item == "Hat") {
            price = Hat;
        }else if ( item == "Socks") {
            price = Socks;
        }else if ( item == "Blanket") {
            price = Blanket;
        }else if ( item.equals("Pillow")) {
            price = Pillow;
        }else {
            System.out.println("Invalid item!");
            i++;
        }

        balance = giftCard - price;

        if (i==0){
            if (balance<0){
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                System.out.println("Thank you for your purchase!\nYour current balance is: "+balance+"$");
            }
        }

    }
}
