package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Pivot_Index_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pivotIndex = findPivotIndex(arr ,n);
        System.out.println(pivotIndex);
    }

    private static int findPivotIndex(int[] arr, int n) {
        int prefixSum[] = new int[n];
        int sum = 0;
        for (int i = 0; i< n; i++){
            sum += arr[i];
            prefixSum[i] = sum;
        }
        if (prefixSum[n - 1] - prefixSum[0] == 0){
            return 0;
        }
        for (int i = 1; i < n - 1; i++){
            int lSum = prefixSum[i - 1];
            int rSum = prefixSum[n - 1] - prefixSum[i];
            if (lSum == rSum)return i;
        }
        if (prefixSum[n - 2] == 0){
            return n - 1;
        }
        return -1;
    }

//    private static int findPivotIndex(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int leftSum = 0;
//            int rightSum = 0;
//
//            for (int j = 0; j < i; j++) {
//                leftSum += arr[j];
//            }
//
//            for (int j = i + 1; j < arr.length; j++) {
//                rightSum += arr[j];
//            }
//
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }
//
//        return -1;
//    }


}

