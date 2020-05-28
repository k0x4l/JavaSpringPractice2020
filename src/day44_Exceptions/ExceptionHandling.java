package day44_Exceptions;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "CyberTek";

        System.out.println("Started");

        try {
            System.out.println(str.charAt(100));
        } catch (RuntimeException e){
            String description = e.getMessage();
            System.out.println(description);
        }
        System.out.println("===============================");
        try {
            System.out.println(100/0);
        } catch (RuntimeException e){
            String description = e.getMessage();
            System.out.println(description);
        }

        System.out.println("Completed");
    }
}

/*
testCase:
        step1
        step2
        step3
        step4
        ...
        step10
*/
