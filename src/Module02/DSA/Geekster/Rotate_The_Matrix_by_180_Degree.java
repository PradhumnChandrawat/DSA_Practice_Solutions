package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_The_Matrix_by_180_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int r = 0; r < n; r++){
            int[] row = arr[r];
            int s = 0, e = arr.length - 1;
            while (s < e){
                int temp = row[s];
                row[s] = row[e];
                row[e] = temp;
                s ++;
                e --;
            }
        }
        for (int c = 0; c < n; c++){
            int s = 0 , e = n - 1;
            while (s < e){
                int temp = arr[s][c];
                arr[s][c] = arr[e][c];
                arr[e][c] = temp;
                s ++;
                e --;
            }
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}