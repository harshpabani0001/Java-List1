import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms (n)
        System.out.print("Enter the number of terms (n) in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Print the first n terms of the Fibonacci sequence
        System.out.println("Fibonacci Sequence (first " + n + " terms):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate the nth Fibonacci number
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
