package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Test_LargetsNumAtLeast_twiceOf_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();;
        }
        System.out.println(findLargest(arr));

    }

    private static int findLargest(int[] arr) {
        int largestIndex = 0;
        int largestNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
                largestIndex = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != largestIndex && arr[i] * 2 > largestNum) {
                return -1;
            }
        }
        return largestIndex;
    }
}
