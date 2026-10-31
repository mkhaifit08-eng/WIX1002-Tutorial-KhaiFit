/*
    4.	Write the statements that display the string in reverse order. 
    (use String.length() to get  the length of the string)
 */

import java.util.Scanner;
public class T4Q4 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to be reversed: ");
        String word = input.next();
        char[] letters = word.toCharArray();

        for(int i=0;i<(word.length()/2);i++){
            char temp = letters[i];
            letters[i] = letters[word.length()-1-i];
            letters[word.length()-1-i] = temp;
        }


        word = String.valueOf(letters); 
        System.out.print("The word reversed become: "+ word);


        input.close();

    }
    
}
