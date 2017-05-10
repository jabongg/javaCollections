import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            findIfFunnyString(str);
        }
    }
    
    
    private static void findIfFunnyString(String str) {
        String strReverse = reverseString(str);
        boolean isFunny = false;
        for (int i = 1; i < (str.length() - 1); i++) {
            if ((strReverse.charAt(i) - strReverse.charAt(i - 1)) != (str.charAt(i) - str.charAt(i - 1))) {
                break;
            }
        }
                
        if (isFunny) {
             System.out.println("Funny");
        } else {
                System.out.println("Not Funny");
        }
    }
    
    private static String reverseString(String str) {
        String reverse = "";
        
        for ( int i = str.length() - 1 ; i >= 0 ; i-- )
         reverse = reverse + str.charAt(i);
 
        return reverse;
    }
}

