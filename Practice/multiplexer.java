/*WAC for checking wheather a string contain wildcard character or not .
 * -> a wild card character is a symbol that may be used to replace one
 *  or more character which are often used in file search so that the full 
 *  name doesn't need to be typed .
 * the ex-of wild card character are *,?,% .
 */

import java.util.*;
public class multiplexer {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String mail;
        System.out.println("Enter your wild card id :");
        mail=sc.next();
        if(mail.contains("@"))
        System.out.println("This is a email id");
        for(int i = 0;i<mail.length();i++){
            if(mail.charAt(i) == '@'){
                System.out.println(i);
            }
        }
    }
}
