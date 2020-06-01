package day46_final_abstract;

public class final_variables {

    final int InstanceVariable = 300 ;
    //final int InstanceVariable2; // final instance variables need to be initialized immediately

    final static int staticVariables = 1000 ;

    //final static int getStaticVariables2;  // final static variables need to be initialized immediately

    public static void main(String[] args) {

        final double PI = 3.14;
        // PI = 3.15 ;

        final String gender = "Male";
        //gender =  "Female";

        final int score ;
        score = 100 ;       //you can initialize just once time (at the final)
        //score = 200 ;
        System.out.println(score);
        System.out.println("==============================================");
        //this.InstanceVariable = 400 ;
        final_variables obj = new final_variables();
        //obj.InstanceVariable = 400 ;

        //staticVariables = 2000;
    }
}
