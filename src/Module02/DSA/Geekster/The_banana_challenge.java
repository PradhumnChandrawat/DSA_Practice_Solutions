package Module02.DSA.Geekster;

import java.util.Scanner;

public class The_banana_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int hour = sc.nextInt();

        System.out.println(minKOKOEatingSpeed(arr, hour));
    }

    private static int minKOKOEatingSpeed(int[] arr, int hour) {
        int min = 1 , max = arr[0];
        for (int ele : arr){
            max = Math.max(ele, max);
        }
        int result = -1;

        while (min <= max){
            int mid = min + (max - min) / 2;
            if (allBananasFinised(arr, mid, hour)){
                result = mid;
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return result;
    }
    private static boolean allBananasFinised(int[] arr, int mid, int hour) {
        int currHour = 0;
        for (int ele : arr){
            currHour += Math.ceil(ele / (mid * 1.0));
        }
        return currHour <= hour;
    }
}
