package Module02.DSA.Geekster;

import java.util.Scanner;

public class Weighty_Voyage_SameOnLeetCode_1011Capacity_To_Ship_In_D_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight[] = new int[n];
        for (int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }
        int days = sc.nextInt();
       int result = shipWithInDays( weight, days);
       System.out.println(result);
    }
    private static int shipWithInDays(int[] weight, int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < weight.length; i++){
            if (start < weight[i]){
                start = weight[i];
            }
            end += weight[i];
        }
        int result = -1;

        //implementing binary search

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isShipmentPossible(weight, mid , days)){
                result = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }

    private static boolean isShipmentPossible(int[] weight, int maxCapacity, int days) {
        int currDay = 1;
        int capacity = 0;
        for (int i = 0; i < weight.length; i++){
            capacity += weight[i];
            if (capacity > maxCapacity){
                currDay++;
                capacity = weight[i];
            }
            if (currDay > days){
                return false;
            }
        }
        return true;
    }
}
