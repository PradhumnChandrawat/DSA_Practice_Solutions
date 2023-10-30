package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Print_Lower_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
