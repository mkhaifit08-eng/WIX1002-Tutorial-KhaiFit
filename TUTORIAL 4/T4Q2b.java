public class T4Q2b {
    public static void main(String[] Args){
        /*
        // The false code:
        do 
        x += 2; 
        y += x;
        System.out.println(x + " and " + y); 
        while (x < 100) 

         */

        // corrected code

        int x=0, y=2;

        do {
            x += 2; 
            y += x; 
            System.out.println(x + " and " + y); 
        }while (x < 100);

    }
}

