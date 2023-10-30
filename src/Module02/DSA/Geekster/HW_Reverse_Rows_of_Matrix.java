package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Reverse_Rows_of_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int r = 0; r < n; r++){
            int s = 0 , e = n - 1;
            while (s < e){
                int temp = arr[r][s];
                arr[r][s] = arr[r][e];
                arr[r][e] = temp;
                s ++;
                e --;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
