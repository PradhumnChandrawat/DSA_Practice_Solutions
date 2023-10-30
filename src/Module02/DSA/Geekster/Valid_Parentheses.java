package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkParentheses_20(s));

    }

    private static boolean checkParentheses_20(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.add(ch);
            }
            else {
                if (stack.isEmpty())return false;
                if (ch == ')' && stack.peek() != '(')return false;
                if (ch == '}' && stack.peek() != '{')return false;
                if (ch == ']' && stack.peek() != '[')return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
