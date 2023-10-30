package Module02.DSA.Geekster;

import java.util.Scanner;

public class Maximum_Count_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : nums) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        int maxCount = Math.max(positiveCount, negativeCount);
        System.out.println(maxCount);
    }
}
