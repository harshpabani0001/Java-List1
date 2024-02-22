import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Convert Celsius to Fahrenheit using the formula: (Celsius * 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
    }
}
