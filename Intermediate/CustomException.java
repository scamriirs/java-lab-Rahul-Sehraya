class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not eligible to vote.");
        } else {
            System.out.println("Age " + age + " is eligible to vote.");
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int[] testAges = {20, 16};

        for (int age : testAges) {
            try {
                Voter.validateAge(age);
            } catch (InvalidAgeException ex) {
                System.out.println("Caught custom exception: " + ex.getMessage());
            }
        }

        System.out.println("Custom exception demo finished.");
    }
}
