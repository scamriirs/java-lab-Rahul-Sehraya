public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println("Dividing " + a + " by " + b);
            int c = a / b; 
            System.out.println("Result = " + c);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e);
        }

        System.out.println("Program continues after try-catch.");
    }
}
