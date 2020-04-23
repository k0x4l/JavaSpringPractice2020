package day_06_ShortHandOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = true ;
        boolean hotWeather = false ;

        if (coldWeather) {
            System.out.println("Weather is cold");
        }

        if (coldWeather) System.out.println("Weather is too cold");

        if (hotWeather) System.out.println(" Weather is hot ?");

        System.out.println("=============================================");
        int a = 101;
        boolean evenNumber = a % 2 == 0 ;
        boolean oddNumber = a % 2 !=0 ;

        if ( evenNumber ) {
            System.out.println(a + " is even number");
        }
        if ( oddNumber ) System.out.println( a + " is odd number");



    }
}
