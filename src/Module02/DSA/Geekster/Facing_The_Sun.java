package Module02.DSA.Geekster;

import java.util.Scanner;

public class Facing_The_Sun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int leftMax = arr[0];
        for (int ele : arr){
            if (ele > leftMax){
                leftMax = ele;
                count ++;
            }
        }
        System.out.println(count);
    }
}
