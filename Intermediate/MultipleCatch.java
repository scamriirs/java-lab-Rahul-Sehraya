public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String s = args.length > 0 ? args[0] : null;
            if (s != null) {
                System.out.println("Length: " + s.length());
            } else {
                throw new NullPointerException("String reference is null");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic problem: " + ae.getMessage());
        } catch (NullPointerException ne) {
            System.out.println("Null pointer encountered: " + ne.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception: " + e);
        }

        System.out.println("End of multiple-catch demo.");
    }
}
