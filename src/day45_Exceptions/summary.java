package day45_Exceptions;

public class summary {
    public static void main(String[] args) {

        try{
            Thread.sleep(3000);
        } catch (Exception e){

        }

        System.out.println("Hello");

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException a){ }
        System.out.println("Completed");
    }
}
