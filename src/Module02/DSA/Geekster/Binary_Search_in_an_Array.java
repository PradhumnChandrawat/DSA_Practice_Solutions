package Module02.DSA.Geekster;

import java.util.Scanner;

public class Binary_Search_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int result = binarySearchAlgo(arr, n, key);
        System.out.println(result);
    }

    private static int binarySearchAlgo(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == key){
                return mid;
            }
            if (key > arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
