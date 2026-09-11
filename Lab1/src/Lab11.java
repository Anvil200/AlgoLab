import java.util.Scanner;
import java.util.Stack;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.next();
        Stack<Character> stack = new Stack();

        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false 1");
                    return;
                }
                char top = stack.pop();
                if (top != bracketPair(bracket)) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }

    public static char bracketPair(char bracket) {
        switch (bracket) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return '1';
        }
    }
}