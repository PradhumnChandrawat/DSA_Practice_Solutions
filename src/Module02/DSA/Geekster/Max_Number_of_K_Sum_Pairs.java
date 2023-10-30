package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Max_Number_of_K_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxOperations(nums, k));
    }

    private static int maxOperations(int[] nums, int k) {
//
//        TC : O(N) , SC : O(N)
//
//        Map<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        for (int ele : nums){
//            map.put(ele, map.getOrDefault(ele, 0)+ 1);
//        }
//        System.out.println(map.keySet());
//        for (int i : map.keySet()){
//            if (map.containsKey(i) && map.containsKey(k - i)){
//                if (i != k - i){
//                    count += Math.min(map.get(i), map.get(k - i));
//                    System.out.println("map.get(i) : "+map.get(i));
//                    map.put(i, 0);
//                    map.put(k - i, 0);
//                }
//                else {
//                    count += Math.floor(map.get(i)/2);
//                    System.out.println("count : "+count);
//                    map.put(i,0);
//                }
//            }
//        }
//        return count;

//        TC : O(NlogN) SC : O(1)

        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j){
            int sum = nums[i] + nums[j];
            if (sum == k){
                i ++;
                j --;
                count ++;
            }
            else if (sum > k) {
                j --;
            }
            else {
                i ++;
            }
        }
        return count;
    }
}
