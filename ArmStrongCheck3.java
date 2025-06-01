package Assignments2;

public class ArmStrongCheck3 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {
            int sum = 0;
            int temp = number;
            int digits = String.valueOf(number).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
