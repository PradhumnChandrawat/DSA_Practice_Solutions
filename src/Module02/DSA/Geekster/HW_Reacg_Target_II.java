package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Reacg_Target_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] indices = findTarget(nums, target);
        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] findTarget(int[] nums, int target) {
        int array[] = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }

        return array;
    }
}
