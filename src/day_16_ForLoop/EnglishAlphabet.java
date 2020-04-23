package day_16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        for (char i = 'A' ; i <= 'Z' ; i++ ){
            System.out.print(i+" ");
        }
        System.out.println("");
        for (char i = 'z' ; i >= 'a' ; i-- ){
            System.out.print(i+" ");
        }
    }
}
