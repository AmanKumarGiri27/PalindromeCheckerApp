public class UseCase9PalindromeCheckerApp {


    public static boolean isPalindrome(String str, int start, int end) {


        if (start >= end) {
            return true;
        }


        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }


    public static void main(String[] args) {

        String input = "racecar";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}