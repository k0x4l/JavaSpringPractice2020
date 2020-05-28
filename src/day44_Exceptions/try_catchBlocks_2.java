package day44_Exceptions;

public class try_catchBlocks_2 {
    public static void main(String[] args) {
        System.out.println("Test started");
        try {
            Thread.sleep(2000);
            System.out.println("Try");
        } catch (Exception e){
            System.out.println("Catch");
        }


        System.out.println("Completed");

    }
}
