package Module02.DSA.Geekster;

import javax.xml.stream.events.StartDocument;
import java.util.Arrays;
import java.util.Scanner;

public class HW_Find_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        findPairs(arr , target);
    }

    private static void findPairs(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);

                while (left < right && arr[left] == arr[left + 1]) left++;
                while (left < right && arr[right] == arr[right - 1]) right--;

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

    }
}
