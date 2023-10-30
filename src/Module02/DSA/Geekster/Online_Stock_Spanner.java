package Module02.DSA.Geekster;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Online_Stock_Spanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int array[] = onlineStockSpanner(arr, n);
        for (int ele : array){
            System.out.print(ele+" ");
        }
    }

    private static int[] onlineStockSpanner(int[] arr, int n) {
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        ans[0] = 1;
        stack.push(0);
        for (int i = 1; i < n; i++){
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = i+1;
            }
            else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
