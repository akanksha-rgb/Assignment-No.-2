package Assignments2;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int reverse = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        // Check if original and reversed numbers are the same
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
