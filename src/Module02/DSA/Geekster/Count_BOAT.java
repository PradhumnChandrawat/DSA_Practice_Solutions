package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Count_BOAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        Arrays.sort(arr);
        int boats = 0;
        int l = 0, r = n - 1;
        while (l <= r){
            boats ++;
            if (arr[l] + arr[r] <= limit){
                l ++;
                r --;
            }else {
                r --;
            }
        }
        System.out.println(boats);
    }
}
