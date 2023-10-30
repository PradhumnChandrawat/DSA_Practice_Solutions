package Module02.DSA.Geekster;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First_Negative_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = firstNegativeInt(arr, n ,k);
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }

    private static int[] firstNegativeInt(int[] arr, int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int i = 0 , j = 0;
        int result[] = new int[n-k+1];
        int idx = 0;
        while (j < n){
            if (arr[j] < 0){
                queue.add(arr[j]);
            }
            if (j - i + 1 == k){
                if (queue.isEmpty()){
                    result[idx] = 0;
                    idx++;
                }
                else {
                    result[idx] = queue.peek();
                    idx++;
                    if (arr[i] == queue.peek()){
                        queue.poll();
                    }
                }
                i ++;
            }
            j ++;
        }
        return result;
    }
}
