package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Element_in_Rotated_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(findElement(arr, key));
    }

    private static int findElement(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int mid = 0;
        boolean flag = false;

        while (start <= end){
            mid = start + (end - start) / 2;

            if (arr[mid] == key){
                return mid;
            }
            else if (arr[start] <= arr[mid]) {

                if (key >= arr[start] && key < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (key > arr[mid] && key <= arr[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
       return -1;
    }
}
