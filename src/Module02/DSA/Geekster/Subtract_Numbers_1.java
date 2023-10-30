package Module02.DSA.Geekster;

import java.util.HashSet;
import java.util.Scanner;

public class Subtract_Numbers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int ele : nums){
            if (ele != 0){
                hs.add(ele);
            }
        }
        System.out.println(hs.size());
    }
}
