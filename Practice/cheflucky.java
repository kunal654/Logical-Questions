/*Problem
Chef considers the number 7 lucky. As a result, he believes that the 7-th letter he sees on a day is his lucky letter of the day.

You are given a string S of length 10, denoting the first 10 letters Chef saw today.
What is Chef's lucky letter?

Input Format
The only line of input contains a string S, of length 10.
Output Format
Print a single character: Chef's lucky letter .
Constraints
S has a length of 10
S contains only lowercase Latin letters (i.e, the characters 'a' to 'z')
Sample 1:
Input
proceeding
Output
d
Explanation:
The 7-th character of "proceeding" is 'd', and hence that is Chef's lucky letter.
Sample 2:
Input
outofsight  
Output
i
Explanation:
The 7-th character of "outofsight"
"outofsight" is 'i', and hence that is Chef's lucky letter. */

import java.util.Scanner;
public class cheflucky{
    public static void main(String [] args){
        System.out.println("Give input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char luckyLetter = s.charAt(6); 
        System.out.println(luckyLetter);
    }
}