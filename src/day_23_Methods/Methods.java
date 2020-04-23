package day_23_Methods;

public class Methods {
    public static void main(String[] args) {
        oddNumber();
        evenNumber();
        printHello5();
        System.out.println("============================");

        evenNumber();
    }

    public static void printHello5(){
        for (int i=0; i<5; i++){
            System.out.println("Hello World");
        }
    }

    public static void oddNumber(){
        for (int i=1;i<100;i=i+2){
            System.out.print(i+"\t");
        }
    }

    public static void evenNumber(){
        for (int i=2;i<100;i=i+2){
            System.out.print(i+"\t");
        }
    }

}
