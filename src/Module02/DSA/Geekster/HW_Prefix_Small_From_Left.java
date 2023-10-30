package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Prefix_Small_From_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int array[] = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i ++){
            min = Math.min(min , arr[i]);
            array[i] = min;
        }
        for (int ele : array) {
            System.out.println(ele);
        }
    }
}
