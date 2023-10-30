package Module02.DSA.Geekster;

import java.util.Scanner;

public class Modify_The_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(arr[r][c] == 1){
                    fillRow(arr, r);
                    fillCol(arr, c);
                }
            }
        }
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(arr[r][c] == -1) arr[r][c] = 1;
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void fillCol(int[][] arr, int c) {
        for(int r = 0; r < arr.length; r++){
            if(arr[r][c] == 0) arr[r][c] = -1;
        }
    }

    private static void fillRow(int[][] arr, int r) {
        for(int c = 0; c < arr[r].length; c++){
            if(arr[r][c] == 0) arr[r][c] = -1;
        }
    }

}
