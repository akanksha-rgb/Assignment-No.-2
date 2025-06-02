package Assignments2;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 1 and 100:");

        for (int number = 1; number <= 100; number++) {
            if (isPalindrome(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }
}
