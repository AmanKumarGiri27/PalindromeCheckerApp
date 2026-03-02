
import java.util.Stack;


class PalindromeChecker {

    // Method to check palindrome using stack internally
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        return input.equals(reversed);
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Create an instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Step 2: Input string
        String input = "level";

        // Step 3: Check palindrome
        boolean result = checker.checkPalindrome(input);

        // Step 4: Display result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}