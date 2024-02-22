import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer or string
        System.out.print("Enter an integer or string: ");
        String input = scanner.nextLine();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the entered input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase (for case-insensitive comparison)
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
