import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {


    public static void main(String[] args) {


        String input = "noon";


        Deque<Character> deque = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }


        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}