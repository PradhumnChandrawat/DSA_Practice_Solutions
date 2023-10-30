package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String_Using_Stack {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        Stack<String> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(String.valueOf(c));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
