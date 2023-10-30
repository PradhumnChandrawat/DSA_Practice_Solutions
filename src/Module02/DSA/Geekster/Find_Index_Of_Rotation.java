package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Index_Of_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationIndex(arr);
        System.out.println(rotationIndex);
    }

    private static int findRotationIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return 0;
    }
}
