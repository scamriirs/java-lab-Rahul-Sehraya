import java.util.Scanner;

public class HarmonicSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n) to calculate the sum of harmonic numbers: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        double sum = 0.0; 

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; 
        }

        System.out.println("The sum of the first " + n + " harmonic numbers is: " + sum);

        scanner.close();
    }
}