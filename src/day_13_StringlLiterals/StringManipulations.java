package day_13_StringlLiterals;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "Cybertek";

        char ch1 = str.charAt(5);

        System.out.println(str.toLowerCase());
        System.out.println(ch1);
        System.out.println(str.length());

        String str2 = "java is fun ";
        str2        = str2.concat(", and it\'s easy");

        System.out.println(str2);


        String name1 = "CYBERTEK";
        name1.toLowerCase();

        /*
        String name1 = new String("CYBERTEK");
        name1.toLowerCase(); */

        System.out.println(name1);

        String name2 = name1.toLowerCase();
        System.out.println(name2);

        String A1 = "      Today is a great day      ";
        A1 = A1.trim(); // remove unused spaces
        System.out.println(A1);



    }
}













