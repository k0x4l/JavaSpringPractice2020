package Repl_it;

import java.util.Scanner;

public class PrintUniqueWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        int z=0;

        for (int i=0; i<words.length ; i++){

            for (int k=0; k<words.length ; k++){

                while(i!=k){
                    if(words[i].equals(words[k])){
                        z++;
                    }
                    break;
                }

            }

            if(z==0){
                System.out.println(words[i]);
            }else{
                z=0;
            }



        }

    }
}
