package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Last_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int result = lastOccurrence(arr, n, key);
        System.out.println(result);
    }

    private static int lastOccurrence(int[] arr, int n, int key) {
        int start = 0, end = n - 1, temp = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == key){
                temp = mid;
                start = mid + 1;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return temp;
    }
}
