package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Delete_Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        while (n --> 0){
            String str = sc.next();
            if (st.isEmpty() || !st.peek().equals(str)){
                st.push(str);
            }
            else {
                st.pop();
            }
        }
        System.out.println(st.size());
    }
}
