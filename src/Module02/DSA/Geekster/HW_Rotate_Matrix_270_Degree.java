package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Rotate_Matrix_270_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //transpose
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
