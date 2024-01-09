import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        // Make sure to close the scanner when you're done using it.
        sc.close();
        
        // Calculate the ones place and tens place digits.
        int onesPlace = Math.abs(number % 10);
        int tensPlace = Math.abs((number / 10) % 10);
        
        if (onesPlace > tensPlace) {
            int sum = onesPlace + tensPlace;
            System.out.println("Sum of digits: " + sum);
        } else {
            int product = onesPlace * tensPlace;
            System.out.println("Product of digits: " + product);
        }
    }
}

