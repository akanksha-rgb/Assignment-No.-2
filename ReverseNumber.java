package Assignments2;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;       // Get last digit
            reverse = reverse * 10 + digit; // Append digit
            number = number / 10;          // Remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
