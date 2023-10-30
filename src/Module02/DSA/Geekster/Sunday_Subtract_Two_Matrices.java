package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Subtract_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();

        int[][] mat1 = new int[m1][n1];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] mat2 = new int[m2][n2];

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[m1][n1];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
