package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_On_Left_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int array[] = nextGreaterEleOnLeft(arr, n);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    private static int[] nextGreaterEleOnLeft(int[] arr, int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++){
            while (!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
