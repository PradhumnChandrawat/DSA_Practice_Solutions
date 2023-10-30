package Module02.DSA.Geekster;

import java.util.Scanner;

public class De_Duplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr);
        System.out.println("ans : "+k);
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length <= 2){
            return arr.length;
        }
        int k = 2;
        for (int i = 2; i < arr.length; i++){
            if (arr[i] != arr[k - 2]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
