
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {


    public static void main(String[] args) {


        String input = "racecar";


        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }


        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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