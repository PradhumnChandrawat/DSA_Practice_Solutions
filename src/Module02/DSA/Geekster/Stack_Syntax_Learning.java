package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Syntax_Learning {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int t = scn.nextInt();
        while(t --> 0) {
            int cn = scn.nextInt();
            switch(cn) {
                case 1:
                    System.out.println(st.size());
                    break;
                case 2:
                    if(st.isEmpty()) System.out.println(-1);
                    else st.pop();
                    break;
                case 3:
                    int x = scn.nextInt();
                    st.push(x);
                    break;
                case 4:
                    System.out.println(st.isEmpty() ? -1 : st.peek());
                    break;
            }
        }
    }
}
