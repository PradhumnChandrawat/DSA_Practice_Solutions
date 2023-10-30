package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Number_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int reversedNum = reversedNum(num);
            stack.push(reversedNum);
        }
        int array[] = new int[stack.size()];
        for (int i = array.length - 1; i >= 0; i--){
            array[i] = stack.pop();
        }
        for (int ele : array){
            System.out.println(ele);
        }
    }

    private static int reversedNum(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
