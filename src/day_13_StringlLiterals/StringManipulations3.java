package day_13_StringlLiterals;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str = "I like Java programming John" ;
        int num1 = str.indexOf("J",8) ;
        System.out.println(num1);

        String str2 = "Cybertek school is awesome"  ;
        int num2 = str2.indexOf("is")   ;
        System.out.println(num2);

        String str3 = "Cybertek"    ;
        int num3 = str3.length()    ;
        System.out.println(num3);

        String names = "Muhtar" ;
        int a1 = names.indexOf("Good Guy")  ;
        System.out.println(a1);                 // negative value means there is no value int the object

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0,fullName.indexOf(" "))  ;
        String lastName = fullName.substring(fullName.indexOf(" ")+1)    ;

        System.out.println(firstName);
        System.out.println(lastName);


    }
}











