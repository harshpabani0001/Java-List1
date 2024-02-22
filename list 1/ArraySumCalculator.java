import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array with the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the sum of the elements using a for loop
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Display the sum of the elements
        System.out.println("Sum of the elements: " + sum);
    }
}
