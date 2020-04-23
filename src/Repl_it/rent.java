package Repl_it;

import java.util.Scanner;

public class rent {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        int condo = 50000;
        int townhouse = 75000;
        int singleFamilyHome = 95000;

        int bedRoom = 30000;
        int backYard = 5000;
        int gaRage = 20000;
        int metroAccessibility0_1= 10000;
        int metroAccessibility2_3 = 5000;
        int highwayAccessibility0_1= 15000;
        int highwayAccessibility2_5 = 8000;
        int highwayAccessibility6_20 = 4000;
        int schoolScore10_8 = 45000;
        int schoolScore7_4 = 20000;
        int schoolScore3_0 = 5000;
        int smoKing = 5000;

        System.out.println("Enter your property type:");
        String type = scan.nextLine();
        if (type.equals("Condo")){
            propertyPrice += condo;
        } else if (type.equals("Townhouse")){
            propertyPrice += townhouse;
        } else if (type.equals("Single Family Home")){
            propertyPrice += singleFamilyHome;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += (numberOfBedrooms * bedRoom);

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean() ;
        if (type.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        } else {
            if (backyard) {
                propertyPrice += backYard;
            }
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if(garage){
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if(garageSpots > 10){
                System.out.println("Pardon, it's not a public parking!");
            }else{
                propertyPrice += garageSpots*gaRage;
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1){
            propertyPrice += metroAccessibility0_1;
        }else if (metroAccessibility > 1 && metroAccessibility <=3){
            propertyPrice += metroAccessibility2_3;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1 ){
            propertyPrice += highwayAccessibility0_1 ;
        }else if (highwayAccessibility > 1 && highwayAccessibility <= 5){
            propertyPrice += highwayAccessibility2_5;
        }else if (highwayAccessibility > 5 && highwayAccessibility >= 20){
            propertyPrice += highwayAccessibility6_20;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore <= 10 && schoolScore > 8 ){
            propertyPrice += schoolScore10_8;
        } else if (schoolScore <= 8 && schoolScore > 4){
            propertyPrice += schoolScore7_4 ;
        } else {
            propertyPrice += schoolScore3_0 ;
        }

        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        if (smoking){
            propertyPrice -= smoKing ;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");

    }
}

