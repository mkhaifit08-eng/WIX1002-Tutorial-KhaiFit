public class T4Q2c {
    public static void main(String[] Args){
        /*
        // The false code:
        for ( x==1, y==20; x < y, x++, y-=2); 
            System.out.println(x & " " & y); 


         */

        // corrected code

        for (int x=1, y=20; x < y; x++, y-=2)
            System.out.println(x + " " + y); 
    }    
}


