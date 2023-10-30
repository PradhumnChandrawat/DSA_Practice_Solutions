package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Sunday_MinimizeSumWithUniqueIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int result = findMinimizeSum(nums, k);
        System.out.println(result);
    }
    public static int findMinimizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int sum = 0;
        int current = 1;
        int idx = 0;

        while (k > 0) {
            if (idx < nums.length && nums[idx] <= current) {
                idx++;
            } else {
                sum += current;
                k--;
            }
            current++;
        }

        return sum;
    }
}
