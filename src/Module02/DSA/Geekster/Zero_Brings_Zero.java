package Module02.DSA.Geekster;

import java.util.Scanner;

public class Zero_Brings_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        makesZero(arr,n);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }

    private static int[] makesZero(int[] arr, int n) {
        int len = arr.length;
        int countZero = 0;
        for (int ele: arr) {
            if (ele == 0){
                countZero++;
            }
        }
        int newLen = len + countZero;
        int j = newLen - 1;

        for (int i = len - 1; i >= 0; i--){
            if (arr[i] == 0){
                if (j < len) arr[j] = 0;
                j --;
            }
            if (j < len) arr[j] = arr[i];
            j --;
        }
        return arr;
    }
}
