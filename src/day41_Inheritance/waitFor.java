package day41_Inheritance;

import java.util.concurrent.TimeUnit;

public class waitFor {
    public static void main(String[] args) {
        try {
            // creating a new process.
            System.out.println("Ms Paint will run.");
            Process p1 = Runtime.getRuntime().exec("mspaint.exe");
            // waits for the process until you terminate.
            p1.waitFor(10, TimeUnit.SECONDS);
            // when you manually close notepad.exe program will continue here
            System.out.println("You have exit from Ms-paint.");
            System.out.println("Notepad will run.");
            Process p2 = Runtime.getRuntime().exec("notepad.exe");
            // waits for the process until you terminate.
            p2.waitFor(10, TimeUnit.SECONDS);
            // when you manually close notepad.exe program will continue here
            System.out.println("You have exited from Notepad.");

        } catch (Exception ex) {
            System.out.println("Oops! an error has occurred.");             }
    }
}
