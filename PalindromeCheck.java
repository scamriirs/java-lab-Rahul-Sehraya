public class PalindromeCheck {
    public static boolean isNumberPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit; 
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 12345;
        System.out.println(num1 + " is a palindrome: " + isNumberPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isNumberPalindrome(num2));
    }
}