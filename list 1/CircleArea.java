import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Declare a double variable for radius
        double radius;

        // Declare a double variable for area
        double area;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius input from the user
        radius = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Compute the area of the circle using the formula: area = π * r^2
        area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
