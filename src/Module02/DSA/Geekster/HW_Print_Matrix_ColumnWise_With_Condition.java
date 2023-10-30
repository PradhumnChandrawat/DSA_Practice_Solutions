package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Print_Matrix_ColumnWise_With_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrixColumnWise(arr, m ,n);
//        for (int i = 0; i < m; i++) {
//            for (int j = i; j < n; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//
//        for (int r = 0; r < m; r ++){
//            if (r % 2 != 0){
//                int s = 0 , e = m - 1;
//                while (s < e){
//                    int temp = arr[r][s];
//                    arr[r][s] = arr[r][e];
//                    arr[r][e] = temp;
//                    s ++;
//                    e --;
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static void printMatrixColumnWise(int[][] arr, int m, int n) {
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
