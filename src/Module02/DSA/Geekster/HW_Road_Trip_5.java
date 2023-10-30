package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Road_Trip_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int currAltitude = 0;
        int highestAltd = 0;

        for (int ele: arr) {
            currAltitude += ele;
            highestAltd = Math.max(highestAltd,currAltitude);
        }
        System.out.println(highestAltd);
    }
}
