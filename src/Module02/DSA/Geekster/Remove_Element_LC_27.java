package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Remove_Element_LC_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("val");
        int val = sc.nextInt();
        int size = removeElement(nums, val);
        System.out.println(size);
    }

    private static int removeElement(int[] nums, int val) {
      int k = 0;
      for (int i = 0; i < nums.length; i++){
          if (nums[i] != val){
              nums[k] = nums[i];
              k++;
          }
      }
      return k;
    }
}
