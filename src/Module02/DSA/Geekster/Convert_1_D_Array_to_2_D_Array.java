package Module02.DSA.Geekster;

import java.util.Scanner;

public class Convert_1_D_Array_to_2_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        int idx = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0 ; j < c; j++){
                matrix[i][j] = arr[idx++];
            }
        }
        for (int i = 0; i <     r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
