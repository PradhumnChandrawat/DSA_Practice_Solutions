package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Test_Swift_ZERO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = sc.nextInt();
            }
            moveZerosToEnd(nums);
        }

    }

    private static void moveZerosToEnd(int[] arr) {
        int idx = 0;
        int array[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                array[idx] = arr[i];
                idx++;
            }
        }
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
