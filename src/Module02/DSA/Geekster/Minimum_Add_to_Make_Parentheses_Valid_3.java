package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Minimum_Add_to_Make_Parentheses_Valid_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = makeParenthesesValid(s);
        System.out.println(result);
    }

    private static int makeParenthesesValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            }
            else {
                count ++;
            }
        }
        return count + stack.size();
    }
}
