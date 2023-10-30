package Module02.DSA.Geekster;

import java.util.ArrayList;
import java.util.Scanner;

public class Merged_Two_Sorted_Arrays_into_Single_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> mergedList = mergeArrays(arr1, arr2);

        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                if (mergedList.isEmpty() || arr1[i] != mergedList.get(mergedList.size() - 1)){
                    mergedList.add(arr1[i]);
                }
                i ++;
            }
            else if (arr1[i] > arr2[j]){
                if (mergedList.isEmpty() || arr2[j] != mergedList.get(mergedList.size() - 1)){
                    mergedList.add(arr2[j]);
                }
                j ++;
            }
            else {
                if (mergedList.isEmpty() || arr1[i] != mergedList.get(mergedList.size() - 1)){
                    mergedList.add(arr1[i]);
                }
                i ++;
                j ++;
            }
        }
        while (i < arr1.length){
            if (mergedList.isEmpty() || arr1[i] != mergedList.get(mergedList.size() - 1)){
                mergedList.add(arr1[i]);
            }
            i ++;
        }
        while (j < arr2.length){
            if (mergedList.isEmpty() || arr2[j] != mergedList.get(mergedList.size() - 1)){
                mergedList.add(arr2[j]);
            }
            j ++;
        }
        return mergedList;
    }
}
