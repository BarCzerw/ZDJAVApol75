package wstepoop.zajecia.kolekcje.queue.paranthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String shouldBeTrue = "( ( ) ( () ) )";
        String shouldBeFalse = "( ( ) ( ()) ) )";

        System.out.println(isBalanced(shouldBeTrue));
        System.out.println(isBalanced(shouldBeFalse));
    }

    public static boolean isBalanced(String input) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                try {
                    stack.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
