package Repl_it;

import java.util.Arrays;

public class isSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6,4,5};

        int[] arr2 = new int[arr.length];
        arr2 = arr;

        Arrays.sort(arr);

        System.out.println("result " +Arrays.equals(arr,arr2));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


    }
}
