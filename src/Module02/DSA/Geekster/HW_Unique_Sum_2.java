package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Unique_Sum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfUnique(arr));
    }

    private static int sumOfUnique(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            boolean unique = uniqueCheck(ele , arr);
            if (unique){
                sum += ele;
            }
        }
        return sum;
    }

    private static boolean uniqueCheck(int ele, int[] arr) {
        int count = 0;
        for(int i : arr){
            if (i == ele){
                ++count;
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }
}
