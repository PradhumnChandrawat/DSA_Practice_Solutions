package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Scanner;

public class HW_Reach_Target_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = twoSum(nums, target);
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int rem = target - num;
            if (map.containsKey(rem)){
                int idx = map.get(rem);
                if (idx == i){
                    continue;
                }
                return new int []{i , idx};
            }
        }
        return new int[]{};
    }
}
