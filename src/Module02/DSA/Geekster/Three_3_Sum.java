package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Three_3_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        threeSum(arr, n);
    }

    private static void threeSum(int[] arr, int n) {
        Arrays.sort(arr);
        int target = 0;
        for (int i = 0; i < n - 2; i++){
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])){
                int l = i + 1 , r = n - 1;
                int remSum = target - arr[i];
                while (l < r){
                    if (arr[l] + arr[r] == remSum){
                        System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                        l ++;
                        r --;
                        while (l < r && arr[l] == arr[l - 1])
                            l ++;
                        while (l < r && arr[r] == arr[r + 1])
                            r --;
                    } else if (arr[l] + arr[r] < remSum) {
                        l ++;
                    }else
                        r --;
                }
            }
        }
    }
}
