package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Sunday_test_Append_K_Int_with_Min_Sum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int appendedSum = findMinimizeSum(arr, k);
        System.out.println(appendedSum);
    }

    private static int findMinimizeSum(int[] arr, int k) {
        boolean numExist[] = new boolean[1000000001];
        for (int num : arr) {
            numExist[num] = true;
        }
        int appSum = 0;
        int numToAdd = 1;

        while (k > 0){
            if (!numExist[numToAdd]){
                appSum += numToAdd;
                numExist[numToAdd] = true;
                k --;
            }
            numToAdd ++;
        }

        return appSum;
    }
}
//    private static int findMinimizeSum(int[] arr, int k) {
//        Arrays.sort(arr);
//
//        int appSum = 0;
//        int numToAdd = 1;
//
//        for (int num : arr) {
//            if (num == numToAdd) {
//                numToAdd++;
//            } else if (num > numToAdd) {
//                appSum += numToAdd;
//                k--;
//                numToAdd++;
//                if (k == 0) {
//                    break;
//                }
//            }
//        }
//        while (k > 0) {
//            appSum += numToAdd;
//            numToAdd++;
//            k--;
//        }
//
//        return appSum;
//    }