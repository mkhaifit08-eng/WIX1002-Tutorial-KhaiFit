/*
    3.	 Write the statements that display the first ten values of the Fibonacci sequence. 
    Given  the formula f1 = 1, f2 =1, fn = fn-1 + fn-2. 
 */

public class T4Q3{
    public static void main(String[] Args){
        int a =0, b =1, fn;

        for(int i=1; i<=10; i++){
            System.out.print(b + "\t");
            fn = a + b;
            a=b;
            b=fn;
        }

    }
}