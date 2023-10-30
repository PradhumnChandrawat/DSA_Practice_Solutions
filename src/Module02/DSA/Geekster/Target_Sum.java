package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetSum(arr, n ,target);
    }

    private static void targetSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (i < j){
            if (arr[i] + arr[j] == target){
                System.out.println(arr[i]+" "+arr[j]);
                i ++;
                j --;
                while (arr[i] == arr[i - 1])
                    i ++;
                while (arr[j] == arr[j + 1])
                    j --;
            } else if (arr[i] + arr[j] < target) {
                i ++;
            }else
                j --;
        }
    }
}
