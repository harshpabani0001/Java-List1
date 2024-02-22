import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer input from the user
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Find the reverse of the given number
        int reverse = reverseNumber(n);

        // Display the result
        System.out.println("Reverse of " + n + " is: " + reverse);
    }

    // Function to find the reverse of a number
    private static int reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }
}
