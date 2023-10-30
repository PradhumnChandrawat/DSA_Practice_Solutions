package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Lucky_Number_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(luckyNum(arr));

    }

    private static int luckyNum(int[] arr) {
        int freq[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++){
            if (freq[i] == i){
                max = freq[i];
            }
        }
        if (max <= 0){
            return -1;
        }
        return max;
    }
}
