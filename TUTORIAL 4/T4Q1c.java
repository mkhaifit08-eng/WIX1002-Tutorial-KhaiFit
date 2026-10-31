/*
    1.	Write statements for each of the following 
        c.	Display a 4-by-5 matrix using random number within 0 to 100. 

 */

import  java.util.Random;

public class T4Q1c {
    public static void main(String[] Args){
        Random rand = new Random();

        System.out.println("Matrix A = ");
        for(int i=0;i<4;i++){
            for(int j=0; j<5; j++){
                int RandNum = rand.nextInt(101);
                System.out.print(RandNum + "\t");
            }
            System.out.println();
        }
    }    
}
