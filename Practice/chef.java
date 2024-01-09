import java.util.Scanner;
public class chef {
    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
        int T,N,A,B;
        System.out.print("Enter Number of Test cases : ");
        T = sc.nextInt();
        String S;
        for(int i = 1;i<=T;i++){
            System.out.print("Enter Inputs for N A B : ");
            N = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.print("Enter Value of S as number of district or state travel :");
            S = sc.next();
            char [] charArr = S.toCharArray();
            int c1 = 0,c0 = 0;
            for(int j = 0;j<N;j++){
                if(charArr[j] == '1'){
                    c1++;
                }
                else{
                c0++;
                }
            }
            System.out.println(A*c0 + B*c1);
            
        }
        
    }
}
