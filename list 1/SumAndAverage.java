public class SumAndAverage {
    public static void main(String[] args) {
        // Declare three integer variables
        int a = 10;
        int b = 20;
        int c = 30;

        // Compute the sum
        int sum = a + b + c;

        // Compute the average
        double average = (double) sum / 3;  // Cast to double for accurate average with decimal points

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
