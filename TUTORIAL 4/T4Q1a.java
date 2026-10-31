/*
    1.	Write statements for each of the following 
        a.	Find the largest integer n so that n3 is less than 2000. 
        b.	Display the square number of the first twelve integers starting from 1. 
        c.	Display a 4-by-5 matrix using random number within 0 to 100. 
        d.	Compute the sum of numbers from 1 to a given number.  
        e.	Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal  places. 

 */

public class T4Q1a{
    public static void main(String[] Args){
        int n=0;

        for(int i=0; Math.pow(i,3)<2000;i++){
            n = i;
        }

        System.out.println("The largest integer  = " + n);
    }
}