/*Problem
Your task is very simple: given two integers A and B, write a program to add these two numbers and output the sum.

Input Format
The first line contains an integer T, the total number of test cases.
Then follow T lines, each line contains two integers, A and B.
Output Format
For each test case, add A and B and display the sum in a new line.

Constraints
1≤T≤1000
0≤A,B≤10000
Sample 1:
Input:
3
1 2
100 200
10 40
Output
3
300
50
Explanation:
Testcase 1:
1+2=3. Hence the first output is 3

Testcase 2: 100+200 = 300
 Hence the second output is 300 */


import java.util.Scanner;
public class sumtest{
    public static void main (String args[]){
        int T,A,B,sum;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number of test case :");
        T= sc.nextInt();
        if(T>=1 && T<=1000){
            for(int i=1;i<=T;i++){
                System.out.println("Enter the value of A & B:");
                A=sc.nextInt();
                B=sc.nextInt();
                if(A>=0 && A<= 10000 && B>=0 && B<=10000){
                sum = A+B;
                System.out.println("The sum of your number is"+sum);
                }
            }
    }
    }
}