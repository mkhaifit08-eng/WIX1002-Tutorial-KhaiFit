


public class T4Q2a {
    public static void main(String[] Args){
        /*
        // The false code:
        for (x = 10; x > 0; x++) 
        sum += x; 
         */

        //The corrected:
        int sum =0;
        for (int x = 10; x > 0; x++) 
            sum += x; 
        System.out.println(sum);
    }
}


