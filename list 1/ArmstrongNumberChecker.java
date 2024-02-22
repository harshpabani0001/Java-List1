import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the entered number is an Armstrong number
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Function to count the number of digits in a number
    private static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

