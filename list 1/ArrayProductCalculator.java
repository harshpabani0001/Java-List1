import java.util.Scanner;

public class ArrayProductCalculator {
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

        int i = 0;
        while (i < size) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the product of the elements using a while loop
        int product = 1;
        i = 0;
        while (i < size) {
            product *= array[i];
            i++;
        }

        // Display the product of the elements
        System.out.println("Product of the elements: " + product);
    }
}
