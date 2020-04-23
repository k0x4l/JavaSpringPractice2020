package day_16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        for (char i = 'Z' ; i >= 'A' ; i--){
            if (i == 'Y' || i == 'H' || i == 'J' || i == 'D'){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }
}
