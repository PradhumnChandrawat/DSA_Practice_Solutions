package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Test_Keep_multi_Found_value_By_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        int original = sc.nextInt();
        while (contains(arr, original)){
            original *= 2;
        }
        System.out.println(original);
    }

    private static boolean contains(int[] arr, int original) {
        for (int ele : arr) {
            if (ele == original){
                return true;
            }
        }
        return  false;
    }
}
