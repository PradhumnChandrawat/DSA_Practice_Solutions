package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Daily_Temperature_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result[] = dailyTemprature(arr);
        for (int ele : result){
            System.out.print(ele+" ");
        }
    }

    private static int[] dailyTemprature(int[] arr) {
       int n = arr.length;
       int ans[] = new int[n];
       Stack<Integer> st = new Stack<>();
       for (int i = n - 1; i >= 0; i--){
           while (!st.isEmpty() && arr[i] >= arr[st.peek()]){
               st.pop();
           }
           if (st.isEmpty()){
               ans[i] = 0;
           }
           else {
               ans[i] = st.peek() - i;
           }
           st.push(i);
       }
       return ans;
    }
}
