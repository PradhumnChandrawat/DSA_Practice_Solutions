package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Middle_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int ele : arr) {
             totalSum += ele;
        }
        int leftSum = 0;
        int rightSum = totalSum;
//        System.out.println(rightSum);

        for (int i = 0; i < n; i++){
            rightSum -= arr[i];

            if (leftSum == rightSum){
                System.out.println(i);
                return;
            }
            leftSum += arr[i];
        }
    }
}
