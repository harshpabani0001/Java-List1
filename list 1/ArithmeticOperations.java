import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Perform arithmetic operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        // Check for division by zero before performing the division operation
        int division = 0;
        if (b != 0) {
            division = a / b;
        } else {
            System.out.println("Cannot perform division as the second integer (b) is zero.");
        }

        // Check for division by zero before performing the modulo operation
        int modulo = 0;
        if (b != 0) {
            modulo = a % b;
        } else {
            System.out.println("Cannot perform modulo as the second integer (b) is zero.");
        }

        // Display the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        // Display division and modulo results only if b is not zero
        if (b != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulo: " + modulo);
        }
    }
}
