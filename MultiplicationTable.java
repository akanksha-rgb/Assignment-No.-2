package Assignments2;

import java.util.Scanner;

    public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for a number
            System.out.print("Enter a number to print its multiplication table: ");
            int number = scanner.nextInt();

            // Print the multiplication table from 1 to 10
            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            scanner.close();
        }
}
