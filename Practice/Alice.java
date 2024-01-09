/*There are 3 problems in a contest namely A,B,C respectively. Alice bets Bob that problem C is the
hardest while Bob says that problem B will be the hardest.
You are given three integers SA,SB,SC which denotes the number of successful submissions of the
problems A,B,C respectively. It is guaranteed that each problem has a different number of submissions.
Determine who wins the bet.
1) If Alice wins the bet (i.e. problem C is the hardest), then output Alice.
2) If Bob wins the bet (i.e. problem B is the hardest), then output Bob.
3) If no one wins the bet (i.e. problem A is the hardest), then output Draw.
Note: The hardest problem is the problem with the least number of successful submissions.
Input Format
The first line of input contains a single integer T denoting the number of test cases. The
description of T test cases follows.
The first and only line of each test case contains three space-separated integers SA,SB,SC,
denoting the number of successful submissions of problems A,B,C respectively.
Output Format

For each test case, output the winner of the bet or print Draw in case no one wins the bet.

Constraints
1≤T≤100
1≤SA,SB,SC≤100
SA,SB,SC are all distinct.
Sample Input 1
3
1 4 2
16 8 10
14 15 9
Sample Output 1
Draw
Bob
Alice */

import java.util.Scanner;
public class Alice {
    public static void main(String []args){
        int  T,SA,SB,SC;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your test case :");
        T = sc.nextInt();
        if (T>=1 && T<=100){
        for(int i = 1;i<=T;i++){
            System.out.println("Enter the value of A,B,C");
            SA = sc.nextInt();
            SB = sc.nextInt();
            SC = sc.nextInt();
            if((SA >= 1 && SA <= 100)&&(SB >= 1 && SB <= 100)&&(SC >= 1 && SC <= 100) && (SA!=SB) && (SB!=SC) && (SC!=SA)){
            if( SA < SB && SA < SC ){
                System.out.println("Draw");
            }
            else if( SB < SC && SB < SA){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
         else{
                System.out.println("Wrong choice");
            }
        }
    }
    else
    {
        System.out.println("Invalid choice:");
    }
    }
}

