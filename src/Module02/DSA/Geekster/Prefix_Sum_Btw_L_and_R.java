package Module02.DSA.Geekster;

import java.util.Scanner;

public class Prefix_Sum_Btw_L_and_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();

        int array[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
            array[i] = sum;
            if (i >= l && i <= r){
                System.out.println(array[i]);
            }
        }

    }
}
//        array[0] = arr[0];
//        for (int i = 1; i < n; i++){
//            array[i] = arr[i] + array[i - 1];
//        }
//        int ans = array[r] - array[l - 1];
//        System.out.println(ans);