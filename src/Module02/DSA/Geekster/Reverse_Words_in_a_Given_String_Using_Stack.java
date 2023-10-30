package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Words_in_a_Given_String_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        Stack <String> stack = new Stack<>();
        for (String ele : arr){
            stack.push(ele);
        }
        for (String ele : arr){
            String pop = stack.pop();
            System.out.print(pop+" ");
        }
    }
}

