public class factorial {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result); // Output: Factorial of 5 is: 120
    }
}