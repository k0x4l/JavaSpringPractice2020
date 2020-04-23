package HackerRank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Number {

    public static void main(String[] args) {

        double myNumber = 1234.123;

        //.setText(new DecimalFormat(".##").format(myNumber));


        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        String US = nf.format(myNumber);

        System.out.println(US);


    }

}
