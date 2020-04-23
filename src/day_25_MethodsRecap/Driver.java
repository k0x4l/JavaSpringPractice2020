package day_25_MethodsRecap;

public class Driver{
    public static void main(String[] args) {
        //byte z = 10;
        String B = "true";
        switch(B){
            case "true":
                System.out.println("monda");
            case "false":
                System.out.println("tue");
            case "g":
                System.out.println("wed");
            default:
                System.out.println("fri");
        }
        float f1 = 12_234.1>123_450.0 ? 12_456 : 60;
        System.out.println(f1);
    }
}