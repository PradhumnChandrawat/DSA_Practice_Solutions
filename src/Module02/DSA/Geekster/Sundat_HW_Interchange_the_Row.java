package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sundat_HW_Interchange_the_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            int temp = arr[0][j];
            arr[0][j] = arr[m - 1][j];
            arr[m - 1][j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
