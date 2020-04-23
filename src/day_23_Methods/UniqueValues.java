package day_23_Methods;

public class UniqueValues {
    public static void main(String[] args) {

        String[] arr = {"A", "B","A", "C","D"};

            for (int j=0; j<arr.length;j++){

                int count2 = 0;
                for ( int i = 0; i < arr.length; i++ ) {
                    if ( arr[i].equals(arr[j]) ) {
                        count2++;
                    }
                }

                if ( count2 == 1 ) {
                    System.out.println(arr[j]);

                }

            }
    }
}
