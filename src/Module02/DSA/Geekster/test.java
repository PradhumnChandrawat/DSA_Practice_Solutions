package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        char[] operations = input.toCharArray();

        int result = calPoints(operations);
        System.out.println(result);
    }

    private static int calPoints(char[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (char op : ops) {
            if (op == '+') {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op == 'D') {
                stack.push(2 * stack.peek());
            } else if (op == 'C') {
                stack.pop();
            } else {
                stack.push(Character.getNumericValue(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}

