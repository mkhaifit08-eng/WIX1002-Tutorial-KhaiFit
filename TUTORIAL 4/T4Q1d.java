/*
    1.	Write statements for each of the following 
        d.	Compute the sum of numbers from 1 to a given number.  
 */

import java.util.Scanner;
public class T4Q1d {
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        int n, sum=0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i=0; i<=n; i++){
            sum += i;
        }

        System.out.println("The sum from 1 to "+n +" is "+sum);
        
        input.close();
    }
}
