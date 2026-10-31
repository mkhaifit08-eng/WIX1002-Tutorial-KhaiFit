/*
    1.	Write statements for each of the following 
        e.	Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal  places. 
 */

public class T4Q1e{
    public static void main(String[] Args){
        int sum = 0;

        for(int i=1;i<=25;i++){
            sum += i/(26-i);
        }

        System.out.println(sum);
    }
}

