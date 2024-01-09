import java.util.*;


class gb {
    public static void main(String args[]) {
        int RA[][] = new int[4][5];
        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Enter value for cell number " + r + "" + c + " : ");
                RA[r][c] = sc.nextInt();
            }
        }
        System.out.println("\n Matrix is : ");
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(RA[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
