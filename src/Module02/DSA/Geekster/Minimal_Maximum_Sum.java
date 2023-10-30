package Module02.DSA.Geekster;

import java.util.Scanner;

public class Minimal_Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int noOfSubArr = sc.nextInt();

        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < n; i++){
            if (start < arr[i]){
                start = arr[i];
            }
            end += arr[i];
        }
        int result = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isPossibleSum(arr, mid, noOfSubArr)){
                result = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(result);
    }

    private static boolean isPossibleSum(int[] arr, int mid, int noOfSubArr) {
        int currSubArray = 1;
        int currMaxSum = 0;
        for (int i = 0; i < arr.length; i++){
            currMaxSum += arr[i];

            if (currMaxSum > mid){
                currSubArray++;
                currMaxSum = arr[i];
            }
            if (currSubArray > noOfSubArr){
                return false;
            }
        }
        return true;
    }
}
