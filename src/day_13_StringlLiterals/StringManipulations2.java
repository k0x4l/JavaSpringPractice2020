package day_13_StringlLiterals;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek School is not bad" ;

        str = str.substring(0,9);
        System.out.println(str);

        String fullName = "Sheyma Ougech" ;
        String firstName ;
        String lastName ;

        firstName = fullName.substring(0,6);
        lastName = fullName.substring(7,13);

        System.out.println(firstName +" "+lastName);

        String gmail1 = firstName+"_"+lastName+"@gmail.com";
        String gmail2 = lastName.concat("_").concat(firstName).concat("@gmail.com") ;
        System.out.println(gmail1+"\n"+gmail2);

        String r1 = "I like C#, C# is fun, C# is cool" ;
        //r1 = r1.replace("C#", "Java") ;
        r1 = r1.replaceFirst("C#", "Java") ;
        System.out.println(r1) ;







    }
}
