package Module02.DSA.Geekster;

import java.util.Scanner;


public class Shift_Matrix_Row_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        rotateRow(arr, n,k);
        
        for (int [] row : arr){
            for (int ele : row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        

    }

    private static void rotateRow(int[][] arr, int n, int k) {
        k = k % n;
        for (int[] row : arr){
            reverse(row, 0, k - 1);
            reverse(row,k, n - 1);
            reverse(row, 0, n - 1);
        }
    }

    private static void reverse(int[] row, int s, int e) {
        while (s < e){
            int temp = row[s];
            row[s] = row[e];
            row[e] = temp;
            s++;
            e--;
        }
    }
}
