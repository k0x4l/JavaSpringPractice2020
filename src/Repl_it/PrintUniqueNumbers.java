package Repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        Arrays.sort(nums);
        int z=0;

        for(int i=0; i<nums.length;i++){

            for(int k=0; k<nums.length ; k++){

                while(i!=k){
                    if(nums[i] == nums [k]){
                        z++;
                    }
                    break;
                }
            }
            if(z==0){
                System.out.println(nums[i]);
            }else{
                z=0;
            }
        }

    }
}
