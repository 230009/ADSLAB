import java.util.Scanner;

public class task8  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the thing: ");
        String input = scan.next();// Read the string from user input
        scan.close();// Close the scanner to avoid resource leaks
        System.out.println("Output: " + (isAllDigits(input, 0) ? "Yes" : "No"));
    }

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true; //if the index reaches the end of the string and no non-digit has been found, return true
        } else if (!Character.isDigit(s.charAt(index))) {
            //// If the current character is not a digit, return false
            return false;
        } else {
            // Recursive case: check the next character in the string
            return isAllDigits(s, index + 1);
        }
    }
}

